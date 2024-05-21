package genericEx.method;

import genericEx.animal.Animal;

public class ComplexBox <T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        // 호출 불가 메서드는 <T> 타입이다. <T extends Animal> 타입이 아니다.
        // Object로 취급하기에 .getName() 호출 불가
        // t.getName();
        return t;
    }
}
