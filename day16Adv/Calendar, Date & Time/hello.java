
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class hello {
    public static void main(String[] args) {

        // DATE AND TIME
        // System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        /*
         * It prints the number of years passed from 1900
         * from 1970 millisecond holds in java
         * it tells the current year from 1900
         */
        // Date and Time from new java 14
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // CALENDAR

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType()); // print type of calendar
        System.out.println(c.getTimeZone()); // print time zone
        System.out.println(c.getTimeZone().getID()); // print place of zonal time -> Asia
        System.out.println(c.getTime());
        System.out.println("Date is: " + c.get(Calendar.DATE));
        System.out.println("Seconds : " + c.get(Calendar.SECOND));
        System.out.println("Hours: " + c.get(Calendar.HOUR));
        System.out.println("Printing time: " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":"
                + c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2026));
    }
}
