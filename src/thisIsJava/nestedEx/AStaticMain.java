package thisIsJava.nestedEx;

public class AStaticMain {
    public static void main(String[] args) {
        AStatic.B b = new AStatic.B();

        System.out.println(b.field1);
        b.method1();

        System.out.println(AStatic.B.field2);
        AStatic.B.method2();
    }
}
