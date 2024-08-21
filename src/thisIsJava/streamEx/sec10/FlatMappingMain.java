package thisIsJava.streamEx.sec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this is java");
        list.add("I am a best developer");
        list.stream()
                // String[] -> Stream<String>
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(System.out::println);

        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                .flatMapToInt(data -> {
                    // String[] -> int[]
                    String[] split = data.split(", ");
                    int[] arr = new int[split.length];
                    for (int i = 0; i < split.length; i++) {
                        arr[i] = Integer.parseInt(split[i]);
                    }
                    // int[] -> intStream
                    return Arrays.stream(arr);
                })
                .forEach(System.out::println);
    }
}
