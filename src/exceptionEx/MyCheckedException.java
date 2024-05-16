package exceptionEx;

// 예외 클래스는 Exception 상속
// Exception을 상속 받은 예외는 체크 예외가 됨

// Checked 예외
// 장점: 컴파일러단에서 문제 파악 가능
// 단점: 모든 Checked 예외를 반드시 처리 혹은 던져야 함, 번거로움
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        // message는 Throwable에 있는 detailMessage에 보관
        // getMessage()를 통해 조회 가능
        super(message);
    }
}
