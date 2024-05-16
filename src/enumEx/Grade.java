package enumEx;

// enum은 일련의 명명된 상수들의 집합이다.
// 자동으로 java.lang.Enum을 상속 받음
// 특징: Type-Safe, 가독성 향상, 일관성 보장, 확장성 용이
// 메소드, 생성자 선언 가능
// 단, 외부에서 생성자 호출 불가능 (private)

public enum Grade {
    // 상수 값으로 생성자 호출
    BASIC(10),
    GOLD(20),
    DIAMOND(30);
    private final int discountPercent;

    // 생성자에 접근제어자 선언 불가.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    // enum도 클래스이다. 따라서 메소드 추가 가능
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
