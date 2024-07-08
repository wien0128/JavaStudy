package thisIsJava.interfaceEx.multipleInterfaces;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("SmartTelevision is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision is turned off");
    }

    @Override
    public void search(String url) {
        System.out.println("SmartTelevision is searching for " + url);
    }
}
