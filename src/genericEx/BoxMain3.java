package genericEx;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        // integerBox.set("abc"); 타입 안전
        Integer integer = integerBox.get();
        System.out.println("integer= " + integer);

        GenericBox<String> stringBox = new GenericBox<String >();
        stringBox.set("Hello World");
        String str = stringBox.get();
        System.out.println("str= " + str);

        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue= " + doubleValue);

        // 타입 추론 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
