package genericEx;

import genericEx.animal.Animal;
import genericEx.animal.Cat;
import genericEx.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("바둑이", 100);
        Cat cat = new Cat("치즈", 50);

        // Bpx<Animal>은 부모 타입이기에 자식 타입(dog, cat)도
        // 전달 가능, 하지만 꺼낼 때는 Animal 타입으로만 꺼냄
        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);
        Animal findAnimal = animalBox.get();
        System.out.println("동물찾음 = " + findAnimal);
    }
}
