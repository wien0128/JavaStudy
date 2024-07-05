package ex.ch07poly.sealedEx;

public sealed class Person permits Employee, Manager{

    public String name;

    public void work() {
        System.out.println("할 일이 결정되지 않았음.");
    }
}
