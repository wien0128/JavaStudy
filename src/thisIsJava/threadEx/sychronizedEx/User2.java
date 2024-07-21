package thisIsJava.threadEx.sychronizedEx;

public class User2 extends Thread {
    private SynchronizedCalculator calculator;

    public User2() {
        setName("User2");
    }

    public void setCalculator(SynchronizedCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}
