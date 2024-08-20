package thisIsJava.streamEx.sec03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineMain {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("hong", 10),
                new Student("shin", 20),
                new Student("kim", 30)
        );

        /*
            방법1
            Stream<Student> studentStream = list.stream();
            - 중간처리
            InStream scoreStream = studentStream.mapToInt(student -> student.getScore());
            - 최종처리
            double avg = scoreStream.average().getAsDouble();
        */

        // 방법2
        double avg = list.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        System.out.println("avg: " + avg);
    }
}
