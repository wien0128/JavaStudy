package thisIsJava.threadEx;

public class WorkThread extends Thread {
    public boolean work = true;

    public WorkThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + " is working.");
            } else {
                Thread.yield();
            }
        }
    }
}
