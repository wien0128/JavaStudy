package exceptionEx;

// 예외 처리하지 않고 바로 밖으로 던지기
// 예외 처리를 하지 못하고 밖으로 던지면 예외 정보와 Stack Trace 출력
// Stack Trace를 활용하면 예외 경로 추적 가능
// Checked 예외를 박으로 던지는 경우 해당 타입과 하위 타입 모두 던지기 가능

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
