package thisIsJava.lambdaEx.sec05;

public class Person {
    public void action(Calcuable c) {
        double res = c.calc(30, 60);
        System.out.println("res= " + res);
    }
}
