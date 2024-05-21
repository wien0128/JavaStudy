package genericEx.method;

import genericEx.animal.Cat;
import genericEx.animal.Dog;

// 제네릭 타입 보다 제네릭 메서드가 더 높은 우선순위를 가짐

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
