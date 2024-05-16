package exceptionEx;

// try~catch에서 처리 못하는 예외여도 finally는 반드시 실행
// 따라서 어떤 경우에도 disconnect는 실행 됨
// = 사용자 자원을 항상 반환

public class NetworkService4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientException e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
