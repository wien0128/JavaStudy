package NestedClassEx;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Model Y", 100);
        
        // 당연히 내부 클래스가 private이기에 임의로 생성 불가능
        //Car.Engine engine = Car.new Engine(); 
        
        myCar.start();
    }
}
