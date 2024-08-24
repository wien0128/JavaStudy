package thisIsJava.streamEx.sec13;

import java.util.Arrays;

// 요소 기본 집계
// 집계(Aggregate)는 최종 처리 기능으로 요소들을 처리해서
// 카운팅, 합계, 평균값, 최대/최소값 등 하나의 값으로 산출하는 것
// 대량의 데이터를 하나의 값으로 축소하는 Reduction 이라고 볼 수 있음

public class AggregateMain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        long cnt = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수 개수: " + cnt);

        long sum = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수 합: " + sum);

        double avg = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수 평균: " + avg);

        int max = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("최대값: " + max);

        int min = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("최소값: " + min);

        int first = Arrays.stream(arr)
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 3의 배수: " + first);
    }
}
