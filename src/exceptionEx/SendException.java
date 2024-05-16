package exceptionEx;

// 전송 실패 시 발생하는 예외

public class SendException extends NetworkClientException2 {
    private final String sendData;
    public SendException(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }
    public String getSendData() {
        return sendData;
    }
}
