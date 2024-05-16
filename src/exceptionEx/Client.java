package exceptionEx;

// throw 예외 - 새로운 예외 발생
// 예외도 객체이기에 new로 생성 후 예외 발생
// throws 예외 - 발생시킨 예외를 메서드 밖으로 던짐

public class Client {
    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");
    }
}
