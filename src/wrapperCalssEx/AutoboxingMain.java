package wrapperCalssEx;

public class AutoboxingMain {
    public static void main(String[] args) {
        // Primitive -> Wrapper, Boxing
        int value = 777;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive, Unboxing
        int unboxedValue = boxedValue.intValue();
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
