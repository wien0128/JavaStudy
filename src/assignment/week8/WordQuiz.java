package assignment.week8;

import java.util.*;

// 단어 클래스
class Word {
    private String english;
    private String korean;

    public Word(String english, String korean) {
        this.english = english;
        this.korean = korean;
    }

    public String getEnglish() {
        return english;
    }

    public String getKorean() {
        return korean;
    }
}

public class WordQuiz {
    private Vector<Word> v; // 단어 목록 벡터

    // 초기 단어 벡터 데이터 추가 및 생성
    public WordQuiz() {
        v = new Vector<Word>();
        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("human", "인간"));
        v.add(new Word("stock", "주식"));
        v.add(new Word("trade", "거래"));
        v.add(new Word("society", "사회"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("honey", "꿀"));
        v.add(new Word("dall", "인형"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("fault", "오류"));
        v.add(new Word("example", "보기"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("statue", "조각상"));
    }

    // 예제 보기 4개 생성 후 정답 위치 반환
    private int makeExample(int[] ex, int answerIdx) {
        Random r = new Random();
        // 이미 선택된 인덱스 추적 Set
        Set<Integer> usedIndices = new HashSet<>();
        // 정답 인덱스 추가
        usedIndices.add(answerIdx);

        // 정답 외의 보기 3개 랜덤 생성
        for (int i = 0; i < ex.length; ++i) {
            int idx;
            do {
                idx = r.nextInt(v.size());
            } while (usedIndices.contains(idx));    // 중복 체크

            ex[i] = idx;    // 보기 배열에 추가
            usedIndices.add(idx);   // 선택된 인덱스 추가
        }

        // 정답 위치 랜덤 지정
        int loc = r.nextInt(4);
        ex[loc] = answerIdx;

        return loc; // 정답 위치 반환
    }

    // 게임 실행
    public void run() {
        System.out.println("\"명품영어\"" + "의 단어 테스트를 시작합니다. -1을 입력하면 종료.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");

        Scanner sc = new Scanner(System.in);
        int questionCnt = 0;    // 출제된 문제 수 카운터

        // 모든 단어가 출제될 때까지 반복
        while (questionCnt < v.size()) {
            // 랜덤 정답 인덱스 선택 후 영어 단어 가져오기
            int answerIdx = (int) (Math.random() * v.size());
            String eng = v.get(answerIdx).getEnglish();

            // 보기 4개 저장 배열
            int[] example = new int[4];
            // 정답 위치 반환
            int answerLoc = makeExample(example, answerIdx);

            // 문제 출력
            System.out.println(eng + "?");

            // 보기 출력
            for (int i = 0; i < example.length; ++i) {
                System.out.print("(" + (i + 1) + ")" + v.get(example[i]).getKorean() + " ");
            }
            System.out.print(":>");

            try {
                int input = sc.nextInt();
                if (input == -1) {  // -1 입력 시 종료
                    System.out.println("\n\"명품영어\" 종료...");
                    break;
                }
                if (input - 1 == answerLoc) { // 정답 확인
                    System.out.println("Excellent !!");
                } else {
                    System.out.println("No. !!");
                }
                ++questionCnt;  // 문제 출제 횟수 증가
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("숫자만 입력하세요.");
            }
        }
        sc.close();
    }

    // 메인
    public static void main(String[] args) {
        WordQuiz quiz = new WordQuiz();
        quiz.run();
    }
}
