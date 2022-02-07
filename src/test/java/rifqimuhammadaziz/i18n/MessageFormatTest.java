package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    // basic message format
    @Test
    void testMessageFormat() {
        var pattern = "Hi {0}, you can search your data by type \"{1}\" in search box";
        var messageFormat = new MessageFormat(pattern);

        var format = messageFormat.format(new Object[]{
                "Xenosty", // {0}
                "Rifqi" // {1}
        });

        System.out.println(format);
    }

    // i18n message format
    @Test
    void testMessageFormatResourceBundle() {
        var locale = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Rifqi Muhammad Aziz", // {0}
                "Xenosty App" // {1}
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundleIndonesia() {
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                "Rifqi Muhammad Aziz", // {0}
                "Xenosty App" // {1}
        });

        System.out.println(format);
    }
}
