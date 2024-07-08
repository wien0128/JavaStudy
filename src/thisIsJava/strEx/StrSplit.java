package thisIsJava.strEx;

public class StrSplit {
    public static void main(String[] args) {
        String arr = "1,자바 학습,참조 타입String을 학습합니다.,홍길동";

        String[] split = arr.split(",");

        for (String s : split) {
            System.out.println(s);
        }
        System.out.println();

        split = arr.split(" ");

        for (String s : split) {
            System.out.println(s);
        }
        System.out.println();

        split = arr.split("");

        for (String s : split) {
            System.out.println(s);
        }
    }
}
