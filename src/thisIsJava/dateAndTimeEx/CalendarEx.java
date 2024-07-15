package thisIsJava.dateAndTimeEx;

import thisIsJava.enumEx.Week;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;

        switch (week) {
            case Calendar.MONDAY -> strWeek = "Monday";
            case Calendar.TUESDAY -> strWeek = "Tuesday";
            case Calendar.WEDNESDAY -> strWeek = "Wednesday";
            case Calendar.THURSDAY -> strWeek = "Thursday";
            case Calendar.FRIDAY -> strWeek = "Friday";
            case Calendar.SATURDAY -> strWeek = "Saturday";
            case Calendar.SUNDAY -> strWeek = "Sunday";
            default -> strWeek = "Unknown";
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM) {
            strAmPm = "AM";
        } else {
            strAmPm = "PM";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.print(year + "년 ");
        System.out.print(month + "월 ");
        System.out.println(day + "일 ");
        System.out.print(strWeek + "요일 ");
        System.out.println(strAmPm + " ");
        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.println(second + "초 ");
    }
}
