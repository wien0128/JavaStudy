package ex.ch07poly.extendsEx;

public class SmartPhone extends Phone{
    SmartPhone(String owner) {
        super(owner);
    }
    void internetSearch() {
        System.out.println("인터넷 검색");
    }
}
