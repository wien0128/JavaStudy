package thisIsJava.classEx;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("자가용");
        System.out.println(car1.company + car1.model);
        System.out.println();

        Car car2 = new Car("자가용", "빨강");
        System.out.println(car2.company + car2.model + car2.color);
        System.out.println();

        Car car3 = new Car("사업자", "검정", 200);
        System.out.println(car3.company + car3.model + car3.color + car3.maxSpeed);
        System.out.println();
    }
}
