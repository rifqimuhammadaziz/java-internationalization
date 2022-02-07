package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    // FORMATTING
    // https://help.gooddata.com/cloudconnect/manual/date-and-time-format.html

    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy kk:mm:ss"; // Monday 07 February 2022 11:24:08
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM yyyy"; // Senin 07 Februari 2022
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy"; // 月曜日 07 2月 2022
        var japan = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, japan);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    // PARSE

    @Test
    void testDateParseIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            var date = dateFormat.parse("Senin 07 Februari 2022"); // Mon Feb 07 00:00:00 WIB 2022
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
