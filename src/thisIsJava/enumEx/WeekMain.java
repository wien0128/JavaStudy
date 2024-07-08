package thisIsJava.enumEx;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int week = calendar.get(Calendar.DAY_OF_WEEK);

        Week today;
        today = switch (week) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> null;
        };
        
        if (today == Week.SUNDAY) {
            System.out.println("일요일");
        } else {
            System.out.println("다른 요일");
        }
    }
}
