package thisIsJava.nestedEx;

public class A {
    class B {
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

    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
