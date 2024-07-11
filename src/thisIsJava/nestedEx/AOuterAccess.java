package thisIsJava.nestedEx;

public class AOuterAccess {
    String field = "A Field";

    void method() {
        System.out.println("A method");
    }

    class B {
        String field = "B Field";
        void method() {
            System.out.println("B method");
        }

        void print() {
            // B 객체의 필드와 메소드 사용
            System.out.println(this.field);
            this.method();
            // 바깥 클래스의 필드와 메소드 사용
            System.out.println(AOuterAccess.this.field);
            AOuterAccess.this.method();
        }
    }

    void useB() {
        B b = new B();
        b.print();
    }
}
