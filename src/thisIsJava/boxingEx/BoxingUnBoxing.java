package thisIsJava.boxingEx;

public class BoxingUnBoxing {
    public static void main(String[] args) {
        // boxing
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        // Unboxing
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
