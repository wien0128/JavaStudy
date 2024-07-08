package thisIsJava.interfaceEx;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(10);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println("Max Volume: " + RemoteControl.MAX_VOLUME);
        System.out.println("Min Volume: " + RemoteControl.MIN_VOLUME);

        RemoteControl.changeBattery();
    }
}
