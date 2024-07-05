package ex.ch07poly;

// 매개변수 다형성 예제

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle vehicle = new Vehicle();
        driver.drive(vehicle);

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
