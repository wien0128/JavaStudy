package thisIsJava.interfaceEx;

public class Audio implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio is turned off");
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

        System.out.println("Current Audio volume is: " + this.volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("Mute On.");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("Mute Off.");
            setVolume(this.memoryVolume);
        }
    }
}
