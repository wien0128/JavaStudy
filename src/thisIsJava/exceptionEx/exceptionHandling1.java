package thisIsJava.exceptionEx;

public class exceptionHandling1 {
    public static void printLength(String data) {
        try {
            // data가 null일 경우 예외 발생
            int res = data.length();
            System.out.println("data length is " + res);
        } catch (NullPointerException e) {
            // 예외 정보를 얻는 3가지 방법
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("printLength end");
        }
    }

    public static void main(String[] args) {
        System.out.println("main start");
        printLength("hello");
        printLength(null);
        System.out.println("main end");
    }
}
