package thisIsJava.strEx;

public class StrContain {
    public static void main(String[] args) {
        
        String str1 = "자바 프로그래밍";
        
        int location = str1.indexOf("프로그래밍");
        System.out.println(location);
        String subString = str1.substring(location);
        System.out.println(subString);

        location = str1.indexOf("자바");
        if (location != -1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        boolean res = str1.contains("자바");
        if (res) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
