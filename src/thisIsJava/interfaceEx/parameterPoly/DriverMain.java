package thisIsJava.interfaceEx.parameterPoly;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 자동타입변환 -> 오버라이딩 메소드 호출 -> 다형성
        // 파라미터 다형성
        driver.drive(bus);
        driver.drive(taxi);
    }
}
