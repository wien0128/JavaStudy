package thisIsJava.threadEx.daemonThreadEx;

public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("---Auto Saving");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
