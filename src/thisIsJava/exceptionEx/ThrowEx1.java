package thisIsJava.exceptionEx;

// main에서 예외를 던지면 JVM이 처리한다

public class ThrowEx1 {
    public static void main(String[] args) throws Exception {
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
