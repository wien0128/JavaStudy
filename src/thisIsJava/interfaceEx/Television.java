package thisIsJava.interfaceEx;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Television is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is off");
    }

    @Override
    public void setVolume(int volume) {
        if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("Current Television volume is: " + this.volume);
    }
}
