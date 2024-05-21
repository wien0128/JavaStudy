package genericEx.method;

import genericEx.animal.Cat;
import genericEx.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("누렁이", 100);
        Cat cat = new Cat("뱅갈이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        // 명시적 타입 X, 타입 추론 O
        Dog targetDog = new Dog("리트리버", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
