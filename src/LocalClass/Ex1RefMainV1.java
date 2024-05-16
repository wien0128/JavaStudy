package LocalClass;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello(Process process) { // 인터페이스를 파라미터로 받기
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run(); // 다형성을 활용하면 각기 다른 인스턴스지만 각기 다른 코드가 실행 가능
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }
    static class Dice implements Process { 
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위= " + randomValue);
        }
    }
    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();
        System.out.println("Hello Execution");
        hello(dice);
        hello(sum);
    }
}
