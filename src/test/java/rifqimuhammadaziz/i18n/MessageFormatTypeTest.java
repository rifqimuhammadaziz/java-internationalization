package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatTypeIndonesia() {
        Locale locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        var messageFormat = new MessageFormat(pattern, locale); // format type
        var format = messageFormat.format(new Object[]{
                "Xenosty", // {1}
                new Date(), // {2}
                1000000 // {3}
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatTypeUS() {
        Locale locale = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        var messageFormat = new MessageFormat(pattern, locale); // format type
        var format = messageFormat.format(new Object[]{
                "Xenosty", // {1}
                new Date(), // {2}
                1000000 // {3}
        });

        System.out.println(format);
    }
}
