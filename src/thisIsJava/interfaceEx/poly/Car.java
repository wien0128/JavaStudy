package thisIsJava.interfaceEx.poly;

public class Car {
    Tire tire1 = new HanTire();
    Tire tire2 = new KumTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }
}
