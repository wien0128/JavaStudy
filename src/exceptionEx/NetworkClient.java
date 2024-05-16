package exceptionEx;

// 오류가 발생 했을 때 오류 코드가 아닌 예외를 던짐
// 따라서, retrun값이 필요 없음
// 메소드가 정상 종료 = 성공, 예외 던져짐 = 실패
// 오류 발생 시 예외 객체 생성 -> 오류 코드+오류 메시지 저장 -> 예외 객체 throw

public class NetworkClient {
    private final String address;
    public boolean connectError;
    public boolean sendError;
    public NetworkClient(String address) {
        this.address = address;
    }
    public void connect() throws NetworkClientException {
        if (connectError) {
            throw new NetworkClientException("connectError", address + "서버 연결 실패");
        }
        System.out.println(address + "서버 연결 성공");
    }
    public void send(String data) throws NetworkClientException {
        if (sendError) {
            throw new NetworkClientException("sendError", address + "서버에 데이터가 전송실패: " + data);
        }
        System.out.println(address + "서버에 데이터 전송: " + data);
    }
    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
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
