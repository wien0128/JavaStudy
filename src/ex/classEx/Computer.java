package ex.classEx;

public class Computer {
    int sum(int ... values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }
}
