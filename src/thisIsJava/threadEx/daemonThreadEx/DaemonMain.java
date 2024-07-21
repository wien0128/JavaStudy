package thisIsJava.threadEx.daemonThreadEx;

public class DaemonMain {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        System.out.println("Main Thread Terminated");
    }
}
