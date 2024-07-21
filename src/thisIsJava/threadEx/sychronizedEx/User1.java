package thisIsJava.threadEx.sychronizedEx;

public class User1 extends Thread {
    private SynchronizedCalculator calculator;

    public User1() {
        setName("User1");
    }

    public void setCalculator(SynchronizedCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}
