package thisIsJava.dateAndTimeEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompare {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH:mm:ss");

        LocalDateTime startDateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("startDateTime: " + startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
        System.out.println("endDateTime: " + endDateTime.format(dtf));

        if (startDateTime.isBefore(endDateTime)) {
            System.out.println("Work in process.");
        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("Terminate.");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("Terminated.");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("remainYear: " + remainYear);
        System.out.println("remainMonth: " + remainMonth);
        System.out.println("remainDay: " + remainDay);
        System.out.println("remainHour: " + remainHour);
        System.out.println("remainMinute: " + remainMinute);
        System.out.println("remainSecond: " + remainSecond);
    }
}
