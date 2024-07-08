package thisIsJava.interfaceEx.multipleInterfaces;

public class MultipleInterfacesMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable srch = new SmartTelevision();
        srch.search("https://www.google.com");
    }
}
