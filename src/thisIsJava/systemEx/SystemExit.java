package thisIsJava.systemEx;

public class SystemExit {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Process Forced Exit");
                System.exit(0);
            }
        }
    }
}
