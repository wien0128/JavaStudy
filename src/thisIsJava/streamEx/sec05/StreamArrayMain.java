package thisIsJava.streamEx.sec05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 배열로부터 스트림 얻기

public class StreamArrayMain {
    public static void main(String[] args) {
        String[] strArr = { "hong", "shin", "kim" };
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        int[] intArr = { 3, 5, 7, 4, 2 };
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }
}
