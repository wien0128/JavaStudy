package thisIsJava.systemEx;

import java.io.IOException;

public class SystemRead {
    public static void main(String[] args) throws IOException {
        int speed = 0;
        int keyCode = 0;

        while (true) {
            if (keyCode != 13 && keyCode != 10) {
                if (keyCode == 49) {
                    ++speed;
                } else if (keyCode == 50) {
                    --speed;
                } else if (keyCode == 51) {
                    break;
                }
                System.out.println();
                System.out.println("1. Speed Up | 2. Speed Down | 3. Exit");
                System.out.println();
                System.out.println("Current speed: " + speed);
                System.out.print(">> ");
            }

            keyCode = System.in.read();
        }

        System.out.println("---Exit---");
    }
}
