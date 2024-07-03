package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRotationMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);
        System.out.println(deque);

        // 오른쪽 회전
        int rotations = 2;
        for (int i = 0; i < rotations; ++i) {
            deque.offerFirst(deque.pollLast());
        }
        System.out.println(deque + " 오른쪽 2칸 회전");

        // 왼쪽 회전
        rotations = 3;
        for (int i = 0; i < rotations; ++i) {
            deque.offerLast(deque.pollFirst());
        }
        System.out.println(deque + " 왼쪽 3칸 회전");
    }
}
