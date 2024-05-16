package stringEx;

public class StringImmutable {
    public static void main(String[] args) {

        // 문자열은 불변 객체다.
        // 따라서 값 변경 시 새로운 객체에 변경해서 반환해야 함.
        // String.concat()은 내부에서 새로운 String 객체를 만들어 반환 함.
        // 따라서 불변성과 객체의 값을 보존함.

        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
