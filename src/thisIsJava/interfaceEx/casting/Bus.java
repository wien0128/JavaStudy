package thisIsJava.interfaceEx.casting;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus is running");
    }

    public void checkFare() {
        System.out.println("Check fare");
    }
}
