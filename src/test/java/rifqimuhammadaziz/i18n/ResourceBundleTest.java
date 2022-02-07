package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    @Test
    void testResourceBundle() {
        // default use language of computer
        var resourceBundle = ResourceBundle.getBundle("message"); // resources/message.properties

        System.out.println(resourceBundle.getString("hello")); // get key 'hello' from properties file
        System.out.println(resourceBundle.getString("goodbye")); // get key 'goodbye' from properties file
    }

    @Test
    void testResourceBundleID() {
        Locale indonesia = new Locale("in", "ID"); // change locale & get message_in_ID.properties
        var resourceBundle = ResourceBundle.getBundle("message", indonesia); // resources/message.properties

        System.out.println(resourceBundle.getString("hello")); // get key 'hello' from properties file
        System.out.println(resourceBundle.getString("goodbye")); // get key 'goodbye' from properties file
    }

    @Test
    void testResourceBundleNotFound() {
        Locale indonesia = new Locale("en", "US"); // auto get default message.properties (because file message_en_US not found)
        var resourceBundle = ResourceBundle.getBundle("message", indonesia); // resources/message.properties

        System.out.println(resourceBundle.getString("hello")); // get key 'hello' from properties file
        System.out.println(resourceBundle.getString("goodbye")); // get key 'goodbye' from properties file
    }

    @Test
    void testResourceBundleMultipleTimes() {
        Locale indonesia = new Locale("en", "US"); // auto get default message.properties (because file message_en_US not found)
        var resourceBundle1 = ResourceBundle.getBundle("message", indonesia); // resources/message.properties
        var resourceBundle2 = ResourceBundle.getBundle("message", indonesia); // resources/message.properties

        System.out.println(resourceBundle1 == resourceBundle2); // same object
    }
}
