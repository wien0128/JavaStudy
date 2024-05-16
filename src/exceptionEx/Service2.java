package exceptionEx;

public class Service2 {
    Client2 client2 = new Client2();

    public void callCatch() {
        try {
            client2.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message: " + e.getMessage());
        }
    }
    public void callThrow() {
        client2.call();
    }
}
