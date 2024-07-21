package thisIsJava.threadEx.sychronizedEx;

public class WorkObject {
    public synchronized void methodA() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA Working");
        notify();  // 다른 스레드를 실행 대기로 만듦

        try {
            wait(); // 자기 자신의 스레드는 일시 정지
        } catch (InterruptedException e) {}
    }

    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB Working");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {}
    }
}
