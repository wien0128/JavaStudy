package wrapperCalssEx;

// 기본형을 객체로 쓸 수 있게끔 래퍼 클래스로 자바가 만들어 놓음
// 특징: 불변 객체 -> equals()로 비교
// 객체이기에 객체 컬렉션(ArrayList, HashMap)에 저장 가능
// 기본형 -> 래퍼 클래스 = Boxing
// 래퍼 클래스 -> 기본형 = UnBoxing
// 미리 toString()을 오버라이딩 해 놓음

public class WrapperClassMain {
    public static void main(String[] args) {

        //미래에 삭제 예정, 대신에 valueOf() 사용
        //Integer newInteger = new Integer(10);

        //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        // Boxing
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        Boolean booleanObj = Boolean.valueOf(Boolean.TRUE);
        // 래퍼 클래스는 객체이기에 null 값 할당 가능
        Integer nullObj = null;

        // System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        // UnBoxing
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longObj = " + longValue);

        System.out.println("비교");
        //System.out.println("==: " + (newInteger == integerObj));
        //System.out.println("equals: " + newInteger.equals(integerObj));
    }
}
