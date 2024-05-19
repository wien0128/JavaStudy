package exceptionEx2;

// try ~ catch 문으로 예외 잡아 처리한다.
// 오류 코드와 예외 메시지 출력
// 예외 처리 했기에 이후 정상 흐름으로 복귀한다.

// 여전히 예외 처리 했지만 코드 읽기가 어렵다.
// disconnect()를 호출해야 한다.

public class NetworkServiceV2_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}
