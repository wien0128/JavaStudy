package exceptionEx;

// Unchecked 예외는 RuntimeException 상속
// RuntimeException 하위 객체들은 런타임 예외라고 부름

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
