package thisIsJava.collectionEx.listEx;

import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("Title" + i, "Content" + i, "Writer" + i));
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("Title" + i, "Content" + i, "Writer" + i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
        }

        int size = list.size();
        System.out.println("The size of the list is: " + size);
        System.out.println();
    }
}
