package thisIsJava.interfaceEx;

public interface RemoteControl {
    // 자동으로 public static final을 붙여 상수로 만든다.
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute On");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Mute Off");
        }
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("Battery change");
    }
}
