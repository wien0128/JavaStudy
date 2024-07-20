package thisIsJava.threadEx;

public class JoinSumMain {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {}

        System.out.println("1-100 Sum: " + sumThread.getSum());
    }
}
