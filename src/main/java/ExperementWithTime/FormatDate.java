package ExperementWithTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDate {
    public static void main(String[] args) {
        String date1 = "Mon, February 6, 2021";
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(date1);
            System.out.println(date);
            System.out.println(formatter.format(date));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
