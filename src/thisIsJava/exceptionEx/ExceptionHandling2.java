package thisIsJava.exceptionEx;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String is exists.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 is exists.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
