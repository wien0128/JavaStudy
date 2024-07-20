package thisIsJava.threadEx;

public class ThreadName {
    public static void main(String[] args) {
        // 스레드 객체 참조 얻기
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " " + mainThread.getState() + " " + mainThread.getPriority() + " " + mainThread.isDaemon());

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    // 스레드의 이름 + 상태 + 자원 + 데몬 스레드 여부
                    System.out.println(getName() + " " + getState() + " " + getPriority() + " " + isDaemon());
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " " + getState() + " " + getPriority() + " " + isDaemon());
            }
        };
        chatThread.setName("chat-Thread");  // 작업 스레드 이름 변경
        chatThread.start();
    }
}
