package exceptionEx;

// 실행 순서
// main() -> service.callCatch() -> client.call() !예외 발생, throw
// main() <- service.callCatch() !예외 처리 <- client.call()
// main() !정상 흐름 <- service.callCatch() <- client.call()

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        // callCatch()에서 예외를 처리하기에 main()까지 예외가 오지 않음
        service.callCatch();
        System.out.println("정상 종료");
    }
}
