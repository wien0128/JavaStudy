package thisIsJava.lambdaEx.sec05;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        // 람다식
        p.action((x, y) -> Computer.staticMethod(x, y));
        // 메소드 참조
        p.action(Computer::staticMethod);

        // 인스턴스 메소드일 경우
        Computer c = new Computer();
        // 람다식
        p.action((x, y) -> c.staticMethod(x, y));
        // 메소드 참조
        p.action(c::instanceMethod);
    }
}
