package wrapperCalssEx;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        // 숫자, 래퍼 객체 반환
        Integer i1 = Integer.valueOf(10);
        // 문자열, 래퍼 객체 반환
        Integer i2 = Integer.valueOf("10");
        // 문자열 전용, 기본형 반환
        int intValue = Integer.parseInt("10");
        // valueOf(String): 래퍼 타입 반환
        // parseInt/Long/Double/etc(String): 기본형 반환

        // 비교
        // compareTo(): 객체의 값과 인자의 값을 비교
        // 객체 > 인자 = 1, 객체 == 인자 = 0, 객체 < 인자 = -1
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        // 산술 연산
        // static 메소드임
        System.out.println("sum = " + Integer.sum(10, 20));
        System.out.println("min = " + Integer.min(10, 20));
        System.out.println("max = " + Integer.max(10, 20));
    }
}
