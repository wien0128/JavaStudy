package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTwoPointerMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);

        while (!deque.isEmpty()) {
            System.out.println("From Front: " + deque.pollFirst());
            if (!deque.isEmpty()) {
                System.out.println("From Back: " + deque.pollLast());
            }
        }
    }
}
