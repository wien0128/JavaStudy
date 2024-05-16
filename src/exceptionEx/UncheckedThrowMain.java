package exceptionEx;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service2 service2 = new Service2();
        service2.callThrow();
        System.out.println("정상 종료");
    }
}
