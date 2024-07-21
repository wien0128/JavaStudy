package thisIsJava.threadEx.sychronizedEx;

public class SafeStopMain {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}

        printThread.setStop(true);
    }
}
