package thisIsJava.streamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParalleStreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(92);
        list.add(13);
        list.add(84);
        list.add(52);

        // 병렬 스트림
        Stream<Integer> stream = list.parallelStream();
        stream.forEach(num -> {
            System.out.println(num + ": " + Thread.currentThread().getName());
        });
    }
}
