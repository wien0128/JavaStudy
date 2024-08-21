package thisIsJava.streamEx.sec06;

import java.util.stream.IntStream;

// 숫자 범위로부터 스트림 얻기

public class StreamRangeMain {
    public static int sum;

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(a -> sum += a);
        System.out.println(sum);
    }
}
