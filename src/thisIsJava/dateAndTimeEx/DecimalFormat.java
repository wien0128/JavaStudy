package thisIsJava.dateAndTimeEx;

public class DecimalFormat {
    public static void main(String[] args) {
        double num = 1234567.89;

        java.text.DecimalFormat df;

        df = new java.text.DecimalFormat("###,###");
        System.out.println(df.format(num));

        df = new java.text.DecimalFormat("###,###.0");
        System.out.println(df.format(num));
    }
}
