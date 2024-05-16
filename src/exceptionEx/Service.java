package exceptionEx;

// Checked 예외는 반드시 잡아서 처리하거나, 던지거나 필수 선택
// RuntimeException을 상속받을 시 UnChecked 예외가 됨

public class Service {
    Client client = new Client();
    
    // 예외 잡기
    public void callCatch() {
        try {
            // 예외 발생 가능성이 있는 코드
            client.call();
        } catch (MyCheckedException e) {
            // 예외 처리 코드
            System.out.println("예외처리, message: " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }
    // Checked 예외 호출한 곳으로 던지기
    // Checked 예외는 잡지 않고 던지러면 throws 예외 메서드 필수 선언
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
