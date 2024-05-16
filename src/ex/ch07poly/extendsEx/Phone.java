package ex.ch07poly.extendsEx;

public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }
    void turn0n() {
        System.out.println("turn On");
    }
    void turn0ff() {
        System.out.println("turn Off");
    }
}
