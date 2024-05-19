package exceptionEx2;

// try-with-resources 사용
// try() 안에 자원은 블럭이 끝나면 AutoCloseable.close() 호출 후 해제
// catch 블럭과는 무관하게 실행

public class NetworkServiceV5 {
    public void sendMessage(String data) throws Exception {
        String address = "https://example.com";
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
