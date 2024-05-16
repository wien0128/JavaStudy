package exceptionEx;

public class NetworkClient2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;
    public NetworkClient2(String address) {
        this.address = address;
    }

    public void connect() throws ConnectException {
        if (connectError) {
            throw new ConnectException(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }
    public void send(String data) throws SendException {
        if (sendError) {
            throw new SendException(data, address + " 서버에 데이터 전송 실패: " + data);
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
