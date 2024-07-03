package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        // Deque의 구현체는 ArrayDeque, LinkedList가 있다.
        // 일반적으로는 LinkedList가 삽입 삭제가 빈번할 때 효율적이지만
        // 현대의 컴퓨터 시스템에서는 특별한 원형 큐 구조를 사용하는 ArrayDeque가 더 효율적이다.
        Deque<Integer> deque = new ArrayDeque<>();

        // 셋 다 앞, 뒤에 요소를 추가
        // add: 공간이 부족할 경우 IllegalStateException을 던짐
        // offer: 공간이 부족할 경우 false를 반환
        // push: 스택의 push 연산과 동일, 공간이 부족할 경우 IllegalStateException을 던짐
        deque.offerFirst(1);
        System.out.println(deque);
        deque.addFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.addLast(4);
        System.out.println(deque);
        deque.push(5);  // 앞에 추가
        System.out.println(deque);
        
        // 둘 다 앞, 뒤의 요소를 조회
        // add: 덱이 비어 있는 경우 NoSuchElementException을 던짐
        // peek: 덱이 비어 있는 경우 null을 반환
        System.out.println("deque.peekFirst(): " + deque.peekFirst());
        System.out.println("deque.getFirst(): " + deque.getFirst());
        System.out.println("deque.peekLast(): " + deque.peekLast());
        System.out.println("deque.getLast(): " + deque.getLast());

        // 셋 다 앞, 뒤의 요소를 제거하고 반환함
        // remove: 덱이 비어 있는 경우 NoSuchElementException을 던짐
        // poll: 덱이 비어 있는 경우 null을 반환
        // pop: 스택의 pop 연산관 동일, 덱이 비어 있는 경우 NoSuchElementException을 던짐
        System.out.println("deque.removeFirst(): " + deque.removeFirst());
        System.out.println("deque.removeLast(): " + deque.removeLast());
        System.out.println("deque.pollFirst(): " + deque.pollFirst());
        System.out.println("deque.pollLast(): " + deque.pollLast());
        System.out.println("deque.pop(): " + deque.pop());  // 앞의 요소를 제거
    }
}
