package exceptionEx;

public class NetworkService {
    public void sendMessage(String data) throws NetworkClientException {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
