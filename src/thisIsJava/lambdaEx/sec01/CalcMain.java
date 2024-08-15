package thisIsJava.lambdaEx.sec01;


public class CalcMain {
    public static void main(String[] args) {
        action((x, y) -> {
            int res = x + y;
            System.out.println("res= " + res);
        });

        action((x, y) -> {
            int res = x - y;
            System.out.println("res= " + res);
        });
    }

    public static void action(Calculable c) {
        int x = 10;
        int y = 90;

        c.calculate(x, y);
    }
}
