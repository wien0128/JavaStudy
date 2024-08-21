package thisIsJava.streamEx.sec09;

import java.util.ArrayList;
import java.util.List;

public class MapingMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("hong", 85));
        list.add(new Student("hong", 92));
        list.add(new Student("hong", 64));

        list.stream()
                .mapToInt(Student::getScore)    // score 스트림으로 변환
                .forEach(System.out::println);
    }
}
