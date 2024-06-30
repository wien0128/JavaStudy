package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
        BatchProcessor processor2 = new BatchProcessor(linkedList);
        processor2.logic(50_000);
    }
}
