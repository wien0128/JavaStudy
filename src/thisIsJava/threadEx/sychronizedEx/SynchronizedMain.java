package thisIsJava.threadEx.sychronizedEx;

public class SynchronizedMain {
    public static void main(String[] args) {
        SynchronizedCalculator calculator = new SynchronizedCalculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
