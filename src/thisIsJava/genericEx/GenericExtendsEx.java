package thisIsJava.genericEx;

public class GenericExtendsEx {
    public static <T extends Number> boolean compare(T a, T b) {
        System.out.println("compare(" + a.getClass().getSimpleName() + ", "
        + b.getClass().getSimpleName() + ")");

        double v1 = a.doubleValue();
        double v2 = b.doubleValue();

        return v1 == v2;
    }

    public static void main(String[] args) {
        boolean res1 = compare(10, 20);
        System.out.println(res1 + "\n");

        boolean res2 = compare(4.5, 4.5);
        System.out.println(res2);
    }
}
