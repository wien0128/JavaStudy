package thisIsJava.genericEx;

public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.content = "100";

        Box box2 = new Box();
        box2.content = "100";

        Box box3 = new Box();
        box3.content = 100;

        boolean res1 = box1.compare(box2);
        System.out.println("res1 = " + res1);

        boolean res2 = box1.compare(box3);
        System.out.println("res2 = " + res2);
    }
}
