package assignment.week8;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

// 숨긴 단어 생성과 사용자 입력 문자에 대한 검증 클래스
class HiddenWord {
    private final String originalWord;
    private String hiddenWord;
    private final Set<Integer> hiddenWordSet = new HashSet<>();

    public HiddenWord(String word) {
        this.originalWord = word;
        this.hiddenWord = hideChars(word, 2);
    }

    // hideCnt 만큼 글자를 숨긴 단어 생성
    private String hideChars(String word, int hideCnt) {
        // 고른 단어 String -> char[]
        char[] wordArr = word.toCharArray();

        // 숨길 단어 랜덤으로 고르기
        while (hiddenWordSet.size() < hideCnt) {
            hiddenWordSet.add((int) (Math.random() * wordArr.length));
        }
        // 숨긴 단어 '-' 처리
        hiddenWordSet.forEach(i -> wordArr[i] = '-');

        // 숨김 처리한 단어 String 반환
        return new String(wordArr);
    }
    // 사용자가 추측한 글자가 숨긴 글자와 일치하는지 확인
    public boolean validateChar(char ch) {
        boolean matched = false;
        Iterator<Integer> it = hiddenWordSet.iterator();

        for (int i : new HashSet<>(hiddenWordSet)) {
            if (originalWord.charAt(i) == ch) {
                updateHiddenWord(i, ch);
                matched = true;
            }
        }
        return matched;
    }

    // 숨긴 단어의 인덱스에 추측한 글자 삽입 후 제거
    private void updateHiddenWord(int idx, char ch) {
        char[] hiddenWordArr = hiddenWord.toCharArray();
        hiddenWordArr[idx] = ch;
        hiddenWord = new String(hiddenWordArr);
        hiddenWordSet.remove(idx);
    }

    // 모든 글자를 맞췄는가?
    public boolean isComplete() {
        return hiddenWordSet.isEmpty();
    }

    // 현재 숨긴 단어 반환
    public String getHiddenWord() {
        return hiddenWord;
    }

    // 숨기기 전 원래 단어 반환
    public String getOriginalWord() {
        return originalWord;
    }
}

// word.txt 로딩과 랜덤 단어 반환 클래스
class WordRepository {
    private final List<String> wordList = new ArrayList<>();

    // word.txt에서 단어를 읽어 단어 목록 생성
    public WordRepository(String filePath) {
        try (Scanner sc = new Scanner(new FileReader(filePath, StandardCharsets.UTF_8))) {
            while (sc.hasNext()) {
                wordList.add(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }
    }

    // 단어 목록에서 무작위 단어 선택 후 HiddenWord 객체 반환
    public HiddenWord getRandomWord() {
        int idx = (int) (Math.random() * wordList.size());
        return new HiddenWord(wordList.get(idx));
    }
}

// 행맨 게임 진행 및 사용자 인터페이스
public class HangManGame {
    private final WordRepository wordRepository;
    private int attemptsRemaining;
    
    public HangManGame(String filePath) {
        this.wordRepository = new WordRepository(filePath);
    }

    // 게임 실행, 한 라운드 씩 진행 후 종료 여부 확인
    public void run() {
        System.out.println("===== 행맨 게임 시작 =====");
        Scanner sc = new Scanner(System.in);

        while (true) {
            HiddenWord hiddenWord = wordRepository.getRandomWord();
            attemptsRemaining = 5;

            decisionWinOrLose(hiddenWord, sc);

            if (!isGameContinuing(sc)) {
                break;
            }
        }

        System.out.println("===== 행맨 게임 종료 =====");
        sc.close();
    }

    // 단일 라운드 실행, 유저가 단어를 맞추거나 시도 횟수가 끝날 때 까지 반복
    private void decisionWinOrLose(HiddenWord hiddenWord, Scanner sc) {
        while (attemptsRemaining > 0) {
            System.out.println("단어: " + hiddenWord.getHiddenWord());
            System.out.print(">>");
            char inputChar = sc.next().charAt(0);

            if (!hiddenWord.validateChar(inputChar)) {
                --attemptsRemaining;
                System.out.println("틀림, 남은 시도 횟수: " + attemptsRemaining);
            }
            if (hiddenWord.isComplete()) {
                System.out.println("게임 승리, 정답: " + hiddenWord.getOriginalWord());
                return;
            }
        }

        System.out.println("게임 패배, 정답: " + hiddenWord.getOriginalWord());
    }
    
    // 사용자에게 게임 진행 여부 확인 후 반환
    private boolean isGameContinuing(Scanner sc) {
        System.out.print("다음 게임? (y/n): ");
        return sc.next().equalsIgnoreCase("y");
    }

    // 메인
    public static void main(String[] args) {
        HangManGame game = new HangManGame("C:\\Users\\Wien\\IdeaProjects\\JavaStudy\\src\\assignment\\week8\\words.txt");
        game.run();
    }
}
