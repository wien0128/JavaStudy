package thisIsJava.streamEx.sec12;

import java.util.Arrays;

// peek(): 리턴 타입이 존재하며 중간 처리 메소드. 따라서 최종 처리 메소드가 없으면 작동 X
// forEach(): 리턴 타입 X, 최종 처리 메소드.
// Consumer: 매개 변수, 함수형 인터페이스. 람다식으로 주로 구현.
//           매개값을 처리(소비)하는 accept() 메소드 존재

public class LoopingMain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // 틀린 peek() 활용법
        Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .peek(a -> System.out.println(a));  // 최종 처리가 없으므로 작동 X

        // 중간 처리 메소드 peek() 반복 처리
        int total = Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println("total= " + total);

        // 최종 처리 메소드 forEach() 반복 처리
        Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n));   // 최종 처리이므로 작동 O
    }
}
