package thisIsJava.streamEx.sec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMain3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Hong", "Male", 87));
        list.add(new Student("Shin", "Male", 65));
        list.add(new Student("Ggum", "Female", 18));
        list.add(new Student("Tiem", "Male", 37));
        list.add(new Student("Baem", "Female", 82));


        Map<String, Double> map = list.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getSex(),
                                Collectors.averagingDouble(Student::getScore)
                        )
                );

        System.out.println(map);
    }
}
