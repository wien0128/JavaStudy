package thisIsJava.threadEx.sychronizedEx;

public class WaitNotifyMain {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();

        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();
    }
}
