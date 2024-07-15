package thisIsJava.mathEx;

import java.util.Arrays;
import java.util.Random;

public class RandomLotto {
    public static void main(String[] args) {
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.println("Select number: ");
        for (int i = 0; i < selectNumber.length; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.println(selectNumber[i] + " ");
        }
        System.out.println();

        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.println("Winning number: ");
        for (int i = 0; i < winningNumber.length; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.println("Result: ");
        if (result) {
            System.out.println("WIN!");
        } else {
            System.out.println("FAIL!");
        }
    }
}
