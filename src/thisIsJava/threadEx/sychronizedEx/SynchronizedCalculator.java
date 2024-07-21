package thisIsJava.threadEx.sychronizedEx;

public class SynchronizedCalculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() + ": " + this.getMemory());
    }

    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}

            System.out.println(Thread.currentThread().getName() + ": " + this.getMemory());
        }
    }
}
