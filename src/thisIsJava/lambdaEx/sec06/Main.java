package thisIsJava.lambdaEx.sec06;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        //p.ordering((a, b) -> a.compareToIgonreCase(b));
        p.ordering(String::compareToIgnoreCase);
    }
}
