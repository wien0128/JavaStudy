package NestedClassEx;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        // 외부 클래스에서는 내부 클래스 생성하는데 외부 클래스 이름 생략 가능
        // 외부 클래스에서 내부 클래스를 생성 시
        // 내부 클래스 인스턴스는 자동으로 외부 클래스 인스턴스 참조
        // ex) Engine() -> Car()
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " START!");
    }
    // 내부 클래스로 구현한 Engine 클래스
    // 메소드를 외부에 노출할 필요 없이 내부에서만 사용 가능하다.
    // 꼭 필요한 메소드만 외부에 노출함으로써 캡슐화를 더 높임
    private class Engine {
        public void start() {
            System.out.println("Charge Level: " + chargeLevel);
            System.out.println(model + " Engine START");
        }
    }
}
