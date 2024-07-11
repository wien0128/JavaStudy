package thisIsJava.nestedEx;

public class AStatic {
    static class B {
        int field1 = 1;
        static int field2 = 2;

        B() {
            System.out.println("B constructor executed");
        }
        void method1() {
            System.out.println("B method1 executed");
        }
        static void method2() {
            System.out.println("B method2 executed");
        }
    }
}
