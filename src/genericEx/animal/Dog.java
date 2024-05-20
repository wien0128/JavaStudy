package genericEx.animal;

public class Dog extends Animal {
    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("왈와아라라와라와라왈왈");
    }
}
