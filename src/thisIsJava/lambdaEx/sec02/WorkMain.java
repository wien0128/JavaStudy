package thisIsJava.lambdaEx.sec02;

public class WorkMain {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(() -> {
            System.out.println("work in");
            System.out.println("do something");
        });

        person.action(() -> System.out.println("work out"));
    }
}
