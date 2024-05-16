package exceptionEx;

// 하나의 try에 정상 흐름을 모두 담음
// 예외는 catch 블록에 처리
// 가독성이 좋아짐

public class NetworkService3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientException e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
    }
}
