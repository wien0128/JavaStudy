package thisIsJava.reflectionEx;

public class GetClassEx {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;

        Class clazz2 = Class.forName("thisIsJava.reflectionEx.Car");

        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println("Package: " + clazz.getPackage().getName());
        System.out.println("Class Simple Name: " + clazz.getSimpleName());
        System.out.println("Class Name: " + clazz.getName());
    }
}
