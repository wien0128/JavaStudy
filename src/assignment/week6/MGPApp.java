package assignment.week6;

import java.util.Scanner;
import java.util.Random;

abstract class Player {
    protected static final String[] BET = {"묵", "찌", "빠"};
    protected String name;
    protected String lastBet = null;

    protected Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastBet() {
        return lastBet;
    }

    public abstract String next();
}

class Human extends Player {
    private final Scanner sc;

    public Human(String name, Scanner sc) {
        super(name);
        this.sc = sc;
    }

    @Override
    public String next() {
        System.out.print(name + ">>");

        while (true) {
            lastBet = sc.nextLine();
            if (isValidInput(lastBet)) {
                break;
            }
            System.out.print("잘못된 입력, 묵 찌 빠 중 하나 다시 선택: ");
        }

        return lastBet;
    }

    private boolean isValidInput(String input) {
        return input.equals(BET[0]) || input.equals(BET[1])
                || input.equals(BET[2]);
    }
}

class Computer extends Player {
    private final Random rand;

    public Computer(String name, Random rand) {
        super(name);
        this.rand = rand;
    }

    @Override
    public String next() {
        lastBet = BET[rand.nextInt(BET.length)];
        System.out.println(name + ">> 결정하였습니다.");
        return lastBet;
    }
}

class Game {
    private final Player players[] = new Player[2];
    private final Scanner sc = new Scanner(System.in);
    private final Random rand = new Random();

    public Game() {
        initPlayers();
    }

    private void initPlayers() {
        System.out.println("****** 묵찌빠 게임을 시작합니다. ******");

        System.out.print("선수이름 입력>>");
        players[0] = new Human(sc.nextLine(), sc);
        System.out.print("컴퓨터이름 입력>>");
        players[1] = new Computer(sc.nextLine(), rand);

        System.out.println("2명의 선수를 생성 완료 하였습니다...\n");
    }

    // 메인 게임 로직
    public void run() {
        int ownerIdx = determineInitOwner();

        while (true) {
            Player owner = players[ownerIdx];
            Player opponent = players[1 - ownerIdx];

            String ownerBet = owner.next();
            String opponentBet = opponent.next();

            displayResults(owner, opponent);

            if (ownerBet.equals(opponentBet)) {
                System.out.println(owner.getName() + "이(가) 이겼습니다.");
                break;
            } else {
                ownerIdx = switchOwner(ownerBet, opponentBet, ownerIdx);
                System.out.println();
            }
        }
        System.out.println("\n게임을 종료합니다...");
    }

    // 가위바위보로 첫 오너 결정
    private int determineInitOwner() {
        while (true) {
            String humanBet = players[0].next();
            String computerBet = players[1].next();

            displayResults(players[0], players[1]);

            if (!humanBet.equals(computerBet)) {
                int winnerIdx = getWinnerIdx(humanBet, computerBet);
                System.out.println("오너가 " + players[winnerIdx].getName() + "로 변경되었습니다.\n");
                return winnerIdx;
            } else {
                System.out.println("비겼습니다. 다시 선택하세요.\n");
            }
        }
    }

    // 오너 변경
    private int switchOwner(String ownerBet, String opponentBet, int curOwnerIdx) {
        int winnerIdx = getWinnerIdx(ownerBet, opponentBet);

        if (winnerIdx != curOwnerIdx) {
            System.out.println("오너가 " + players[winnerIdx].getName() + "로 변경되었습니다.\n");
            return winnerIdx;
        }
        return curOwnerIdx;
    }

    // 현재 판 승패에 따른 오너 가져오기
    private int getWinnerIdx(String bet1, String bet2) {
        return (bet1.equals("묵") && bet2.equals("찌")) ||
                (bet1.equals("찌") && bet2.equals("빠")) ||
                (bet1.equals("빠") && bet2.equals("묵")) ? 0 : 1;
    }

    // 현재 판 bet 출력
    private void displayResults(Player p1, Player p2) {
        System.out.println(p1.getName() + " : " + p1.getLastBet() + ", " +
                        p2.getName() + " : " + p2.getLastBet());
    }
}

public class MGPApp {
    public static void main(String[] args) {
        new Game().run();
    }
}
