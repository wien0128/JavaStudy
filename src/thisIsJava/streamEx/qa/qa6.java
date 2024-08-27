package thisIsJava.streamEx.qa;

import java.util.Arrays;
import java.util.List;

public class qa6 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("Hong", 30),
                new Member("Shin", 40),
                new Member("Ggam", 26)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("avg= " + avg);
    }
}
