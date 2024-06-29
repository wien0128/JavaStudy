package collection.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        _LinkedList<String> strList = new _LinkedList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        String string = strList.get(0);
        System.out.println("String: " + string);
        System.out.println(strList.toString());

        _LinkedList<Integer> intList = new _LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("Integer: " + integer);
        System.out.println(intList.toString());
    }
}
