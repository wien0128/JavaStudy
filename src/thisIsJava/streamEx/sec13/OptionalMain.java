package thisIsJava.streamEx.sec13;

// Optional Class
// 단순히 집계값만 저장하는 클래스가 아닌 예외 처리 가능
// boolean isPresent(): 집계값이 있는지 여부
// T/double/int/long orElse(T/double/int/long): 집계값이 없을 경우 디폴트 값 설정
// void isPresent(Double/Int/Long/Consumer): 집계값이 있을 경우 Consumer 에서 처리

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*
            NoSuchElementException 발생
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        */

        OptionalDouble od = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (od.isPresent()) {
            System.out.println("Way1 avg: " + od.getAsDouble());
        } else {
            System.out.println("Way1 avg: 0.0");
        }

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Way2 avg: " + avg);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(x -> System.out.println("Way3 avg: " + x));
    }
}
