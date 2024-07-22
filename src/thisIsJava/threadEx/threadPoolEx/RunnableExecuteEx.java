package thisIsJava.threadEx.threadPoolEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteEx {
    public static void main(String[] args) {
        String[][] mails = new String[100][3];
        for (int i = 0; i < mails.length; i++) {
            mails[i][0] = "admin@my.com";
            mails[i][1] = "member_" + i + "@my.com";
            mails[i][2] = "New Stuff In!";
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; ++i) {
            final int idx = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    String from = mails[idx][0];
                    String to = mails[idx][1];
                    String content = mails[idx][2];
                    System.out.println("[" + thread.getName() + "] " + from + " -> " + to + ": " + content);
                }
            });
        }

        executorService.shutdown();
    }
}
