package thisIsJava.dateAndTimeEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperation {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Now: " + now.format(dtf));

        LocalDateTime res1 = now.plusYears(1);
        System.out.println("1 Year Plus: " + res1.format(dtf));

        LocalDateTime res2 = now.minusMonths(2);
        System.out.println("2 Months Minus: " + res2.format(dtf));

        LocalDateTime res3 = now.plusDays(7);
        System.out.println("7 Days Plus: " + res3.format(dtf));
    }
}
