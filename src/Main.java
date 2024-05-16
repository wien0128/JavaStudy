import java.math.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            length += arr[i].length;
        }

        avg = (double) sum / length;

        System.out.println(sum);
        System.out.println(avg);
    }
}
