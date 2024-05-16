package exceptionEx;

// Unchecked 예외
// 장점: 무시 가능, 처리할 수 없는 Checked 예외는 던져야 하지만 Unchecked 예외는 throws 생략 가능
// 단점: 실수로 예외 처리 누락 가능

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service2 service2 = new Service2();
        service2.callCatch();
        System.out.println("정상 종료");
    }
}
