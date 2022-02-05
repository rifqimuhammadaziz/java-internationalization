package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

public class ResourceBundleTest {

    @Test
    void testResourceBundle() {
        var resourceBundle = ResourceBundle.getBundle("message"); // resources/message.properties

        System.out.println(resourceBundle.getString("hello")); // get key 'hello' from properties file
        System.out.println(resourceBundle.getString("goodbye")); // get key 'goodbye' from properties file
    }
}
