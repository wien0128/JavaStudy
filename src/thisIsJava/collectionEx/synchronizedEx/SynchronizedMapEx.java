package thisIsJava.collectionEx.synchronizedEx;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; ++i) {
                    map.put(i, "Value-" + i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; ++i) {
                    map.put(i, "Value-" + i);
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

        System.out.println("총 객체 수: " + map.size());
        System.out.println();
    }
}
