package NestedClassEx;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.NestedStatic nestedStatic = new NestedOuter.NestedStatic();

        nestedStatic.print();

        System.out.println("nestedClass = " + nestedStatic.getClass());
    }
}
