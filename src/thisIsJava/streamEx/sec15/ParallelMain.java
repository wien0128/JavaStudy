package thisIsJava.streamEx.sec15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelMain {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000000; ++i) {
            list.add(rand.nextInt(101));
        }

        double avg = 0.0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;

        // 일반 스트림 처리
        Stream<Integer> stream = list.stream();
        startTime = System.nanoTime();
        avg = stream
                .mapToInt(i -> i.intValue())
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg= " + avg + ", 일반스트림 처리시간= " + time + "ns");

        // 병렬 스트림 처리
        Stream<Integer> parallelStream = list.parallelStream();
        startTime = System.nanoTime();
        avg = parallelStream
                .mapToInt(i -> i.intValue())
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg= " + avg + ", 병렬스트림 처리시간= " + time + "ns");
    }
}
