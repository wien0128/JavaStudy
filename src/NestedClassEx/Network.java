package NestedClassEx;


public class Network {
    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // private을 사용해 다른 개발자들에게
    // 명시적으로 내부에서만 사용하는 클래스임을 알림
    private static class NetworkMessage {
        private String content;
        public NetworkMessage(String content) {
            this.content = content;
        }
        public void print() {
            System.out.println(content);
        }
    }
}
