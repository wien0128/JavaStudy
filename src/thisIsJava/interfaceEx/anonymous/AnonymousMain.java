package thisIsJava.interfaceEx.anonymous;

public class AnonymousMain {
    public static void main(String[] args) {
        
        // 익명 구현 객체 
        RemoteControl remoteControl = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turning on...");
            }

            @Override
            public void turnOff() {
                System.out.println("Turning off...");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("Volume set to " + volume);
            }
        };

        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.turnOff();
    }
}
