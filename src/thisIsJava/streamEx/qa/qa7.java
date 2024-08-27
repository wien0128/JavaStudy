package thisIsJava.streamEx.qa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class qa7 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("Hong", "Developer"),
                new Member("Kim", "Disgner"),
                new Member("Shin", "Developer")
        );

        List<Member> dves = list.stream()
                .filter(s -> s.getJob().equals("Developer"))
                .collect(Collectors.toList());

        dves
                .stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
