package collection.list;

// 생성자 의존관계 주입
// MyList list 변수는 런타임에 타입 결정됨.
// 외부에서 의존관계(MyArrayList, MyLinkedList)가 주입되는 것과 유사함.
// 따라서 의조관계 주입(Dependency Injection)이라 함. 생성자를 통함.

public class BatchProcessor {
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Size: " + size + ", Time: " + (endTime - startTime) + "ms");
    }
}
