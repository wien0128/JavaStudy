package thisIsJava.threadEx.sychronizedEx;

public class PrintThread extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Working On It");
            // interrupt() 메소드가 호출되었다면 while 문을 빠져나감
            if (Thread.interrupted()) {
                break;
            }
        }
        System.out.println("Resource Cleanup");
        System.out.println("Terminating Thread");
    }
}
