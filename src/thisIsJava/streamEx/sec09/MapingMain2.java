package thisIsJava.streamEx.sec09;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapingMain2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 정수 스트림 -> 실수 스트림
        IntStream intStream = Arrays.stream(arr);
        intStream
                .asDoubleStream()
                .forEach(System.out::println);

        System.out.println();

        // 정수 기본 타입 스트림 -> 정수 래퍼 타입 스트림
        intStream = Arrays.stream(arr);
        intStream
                .boxed()
                .forEach(o -> System.out.println(o.intValue()));
    }
}
