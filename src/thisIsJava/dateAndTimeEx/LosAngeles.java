package thisIsJava.dateAndTimeEx;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngeles {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(tz);

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM) {
            strAmPm = "AM";
        } else {
            strAmPm = "PM";
        }

        int hour    = now.get(Calendar.HOUR);
        int minute  = now.get(Calendar.MINUTE);
        int second  = now.get(Calendar.SECOND);

        System.out.println(strAmPm + " " + hour + ":" + minute + ":" + second);

        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs) {
            System.out.println(id);
        }
    }
}
