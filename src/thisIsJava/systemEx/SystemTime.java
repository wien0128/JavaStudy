package thisIsJava.systemEx;

public class SystemTime {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;
        for (int i = 1; i < 1000000; ++i) {
            sum += i;
        }
        long time2 = System.nanoTime();

        System.out.println("Time taken: " + (time2 - time1) + " ms");
    }
}
