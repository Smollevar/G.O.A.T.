package ExperementWithTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    public static void main(String[] args) {
        Calendar date1 = new GregorianCalendar(2021, 7, 26);
        date1.set(2021, Calendar.AUGUST, 26, 10, 24, 25);
        date1.set(Calendar.HOUR_OF_DAY, 11);
        date1.set(Calendar.MINUTE, 11);
        date1.set(Calendar.SECOND, 11);
        System.out.println(date1.getTime());
        System.out.println();
        date1.add(Calendar.MONTH, -3);
        System.out.println(date1.getTime());
        System.out.println("Year: " + date1.get(Calendar.YEAR));
        System.out.println(
        );
        DateFormat df1 = new SimpleDateFormat("dd MMM yyyy D F Номер дня недели" +
                " E Текущее время в 12-часовом формате" +
                " a hh, z Z");
        GregorianCalendar cann = new GregorianCalendar(216, Calendar.AUGUST, 2);
        cann.set(Calendar.ERA, GregorianCalendar.BC);
        System.out.println(df1.format(date1.getTime()));

        DateFormat df = new SimpleDateFormat("dd MMMM yyy GG");
        System.out.println(df.format(cann.getTime()));
    }
}
