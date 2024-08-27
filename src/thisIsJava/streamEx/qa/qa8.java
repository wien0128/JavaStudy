package thisIsJava.streamEx.qa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class qa8 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("Hong", "Developer"),
                new Member("Kim", "Disgner"),
                new Member("Shin", "Developer")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));

        System.out.println("[Dev]");
        groupingMap.get("Developer")
                .forEach(System.out::println);

        System.out.println();

        System.out.println("[Disgner]");
        groupingMap.get("Disgner").stream()
                .forEach(System.out::println);
    }
}
