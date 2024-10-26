package assignment;

import java.util.Scanner;

class Player {
    private String name;
    private Scanner sc;

    public Player(String name, Scanner sc) {
        this.name = name;
        this.sc = sc;
    }
    
    public String getName() {
        return name;
    }
    
    public String getWord() {
        System.out.print(name + ">>");
        return sc.next();
    }
}

public class WordGameApp {
    private Player[] players;
    private int numPlayers;
    private Scanner sc;

    public WordGameApp() {
        sc = new Scanner(System.in);
        initPlayers();
    }

    // 플레이어 초기화
    private void initPlayers() {
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        numPlayers = sc.nextInt();
        players = new Player[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.print((i + 1) + "번째 참가자의 이름을 입력하세요>>");
            String name = sc.next();
            players[i] = new Player(name, sc);
        }
    }

    public Boolean checkSuccess(String lastWord, String newWord) {
        // 마지막 단어의 끝과 새 단어의 처음이 같은지 비교
        return lastWord.charAt(lastWord.length() - 1) == newWord.charAt(0);
    }

    public void run() {
        String lastWord = "아버지";
        System.out.println("시작 단어는 " + lastWord + "입니다.");

        // 현재 플레이어 인덱스
        int curPlayerIdx = 0;

        while (true) {
            // 현재 플레이어 정보
            Player curPlayer = players[curPlayerIdx];
            // 현재 플레이어의 답 가져오기
            String newWord = curPlayer.getWord();
            
            if (newWord.length() == 0) {
                System.out.println("최소 1글자 이상 입력해야 합니다. 다시 입력하세요.");
                continue;
            }

            // 정답 여부 확인
            if (!checkSuccess(lastWord, newWord)) {
                System.out.println(curPlayer.getName() + "님이 졌습니다.");
                break;
            }

            // 다음 차례로 진행
            lastWord = newWord;
            curPlayerIdx = (curPlayerIdx + 1) % numPlayers;
        }

        System.out.println("게임이 종료되었습니다.");
    }

    public static void main(String[] args) {
        WordGameApp app = new WordGameApp();
        app.run();
    }
}
