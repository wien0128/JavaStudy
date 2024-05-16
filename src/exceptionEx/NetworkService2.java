package exceptionEx;

// try ~ catch를 통해 예외 발생 예상 구간을 묶음
// 이를 통해 예외 잡기 가능
// 여기서 예외를 잡으면 오류 코드와 예외 메시지 출력
// 예외를 처리 했기에 오류 출력 후 정상 흐름으로 복귀

public class NetworkService2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);
        client.initError(data);

        try {
            client.connect();
        } catch (NetworkClientException e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientException e) {
            System.out.println("[오류] 코드: " + e.getMessage() + ", 메시지: " + e.getMessage());
            return;
        }

        client.disconnect();
    }
}
