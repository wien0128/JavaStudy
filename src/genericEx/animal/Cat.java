package genericEx.animal;

public class Cat extends Animal {
    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("냐아아아아ㅏ아아옹");
    }
}
