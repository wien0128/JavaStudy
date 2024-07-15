package thisIsJava.systemEx;

public class SystemErr {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.err.println("Error!");
            System.err.println(e.getMessage());
        }
    }
}
