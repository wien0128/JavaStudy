package thisIsJava.genericEx;

public class Box2Main {
    public static <T> Box2<T> boxing(T t) {
        Box2 box = new Box2();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box2<Integer> box1 = boxing(100);
        System.out.println(box1.get());

        Box2<String> box2 = boxing("Hello");
        System.out.println(box2.get());
    }
}
