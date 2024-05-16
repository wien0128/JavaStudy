package exceptionEx;

// 예외 클래스를 세부적으로 분리하니 필요에 맞게 예외 잡기 가능

public class NetworkService5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient2 client2 = new NetworkClient2(address);
        client2.initError(data);

        try {
            client2.connect();
            client2.send(data);
        } catch (ConnectException e) {  // 연결 예외 잡고 출력
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendException e) {     // 전송 예외 잡고 출력
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        } finally {
            client2.disconnect();
        }
    }
}
