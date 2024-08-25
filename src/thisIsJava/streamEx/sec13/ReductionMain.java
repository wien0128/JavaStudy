package thisIsJava.streamEx.sec13;

import java.util.Arrays;
import java.util.List;

// 요소 커스텀 집계
// Optional<T> reduce(BinaryOperator<T> accumulator)
// T reduce(T identity,BinaryOperator<T> accumulator)

public class ReductionMain {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Hong", 92),
                new Student("Shin", 56),
                new Student("Ggum", 23)
        );

        int sum1 = students.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = students.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
    }
}
