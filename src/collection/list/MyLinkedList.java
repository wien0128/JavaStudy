package collection.list;

public class MyLinkedList<E> implements MyList<E> {
    private MyLinkedList.Node<E> head;   // 연결 리스트 헤드 노드
    private int size = 0;   // 연결 리스트 요소 개수

    /**
     * 연결 리스트의 각 요소를 나타내는 정적 중첩 클래스
     * @param <E> 노드에 저장된 요소의 타입
     */
    private static class Node<E> {
        E item; // 노드에 저장된 요소
        MyLinkedList.Node<E> next;   // 다음 노드를 가리키는 참조

        Node(E item) {
            this.item = item;
            this.next = null;
        }
    }

    /**
     * 리스트의 마지막 노드 반환
     * @return 리스트의 마지막 노드
     */
    private MyLinkedList.Node<E> getLastNode() {
        MyLinkedList.Node<E> last = head;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    /**
     * 주어진 인덱스의 노드 반환
     * @param index 찾고자 하는 노드의 인덱스
     * @return 주어진 인덱스의 노드
     */
    private MyLinkedList.Node<E> getNode(int index) {
        MyLinkedList.Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    @Override
    public E get(int index) {
        MyLinkedList.Node<E> node = getNode(index);
        return node.item;
    }

    /**
     * 주어진 인덱스의 요소를 새 요소로 대체
     * @param index 대체하고자 하는 요소의 인덱스
     * @param e 새 요소
     * @return 대체된 이전의 요소
     */
    @Override
    public E set(int index, E e) {
        MyLinkedList.Node<E> current = getNode(index);
        E oldValue = current.item;
        current.item = e;
        return oldValue;
    }

    /**
     * 리스트의 끝에 요소를 추가
     * @param e 추가하고자 하는 요소
     */
    @Override
    public void add(E e) {
        MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            MyLinkedList.Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    /**
     * 주어진 인덱스에 요소를 추가
     * @param index 요소를 추가하고자 하는 위치의 인덱스
     * @param e 추가하고자 하는 요소
     */
    @Override
    public void add(int index, E e) {
        MyLinkedList.Node<E> newNode = new MyLinkedList.Node<>(e);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyLinkedList.Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    /**
     * 주어진 인덱스의 요소를 제거
     * @param index 제거하고자 하는 요소의 인덱스
     * @return 제거된 요소
     */
    @Override
    public E remove(int index) {
        MyLinkedList.Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;

        if (index == 0) {
            head = removeNode.next;
        } else {
            MyLinkedList.Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;

        return removedItem;
    }

    /**
     * 리스트의 요소 개수를 반환
     * @return 리스트의 요소 개수
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 주어진 요소의 인덱스를 반환
     * @param o 찾고자 하는 요소
     * @return 요소의 인덱스, 요소가 없을 경우 -1 반환
     */
    @Override
    public int indexOf(Object o) {
        int index = 0;

        for (MyLinkedList.Node<E> current = head; current != null; current = current.next) {
            if (o.equals(current.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * 리스트의 문자열 표현 반환
     * @return 리스트의 문자열 표현
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyLinkedList { ");
        sb.append("size= ").append(size).append(", ");
        sb.append("item= [ ");
        MyLinkedList.Node<E> current = head;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
        sb.append(" ] }");

        return sb.toString();
    }
}
