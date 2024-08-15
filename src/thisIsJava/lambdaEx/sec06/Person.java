package thisIsJava.lambdaEx.sec06;

public class Person {
    public void ordering(Comparable c) {
        String a = "Hong";
        String b = "Giil";

        int res = c.compare(a, b);

        if (res < 0) {
            System.out.println(a + " 은 " + b + " 보다 앞에 옵니다.");
        } else if (res == 0) {
            System.out.println(a + " 은 " + b + " 과 같습니다.");
        } else {
            System.out.println(a + " 은 " + b + " 보다 뒤에 옵니다.");
        }
    }
}
