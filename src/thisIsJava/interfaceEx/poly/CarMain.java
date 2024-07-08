package thisIsJava.interfaceEx.poly;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new KumTire();
        myCar.tire2 = new HanTire();

        myCar.run();
    }
}
