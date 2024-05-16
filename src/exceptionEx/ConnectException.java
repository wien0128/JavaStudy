package exceptionEx;

// 연결 실패 시 발생하는 예외

public class ConnectException extends NetworkClientException2 {
    private final String address;
    public ConnectException(String address, String message) {
        super(message);
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
