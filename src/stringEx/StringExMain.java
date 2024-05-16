package stringEx;

public class StringExMain {
    public static void main(String[] args) {

        /*
         String 비교는 항상 equals()를 사용
         문자열 리터럴은 문자열 풀에 객체로서 생성됨, 같은 리터럴이라면 이 객체를 참조
         따라서 동일성 비교시 TRUE가 나와버림.
         동일성 비교(==), 같은 객체를 참조해야 TRUE
         동등성 비교(equals()), 같은 값(문자열)을 가져야 TRUE
        */

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }
    private static boolean isSame(String x, String y) {
        return x == y;
        //return x.equals(y);
    }
}
