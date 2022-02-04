package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocaleID() {
        var language = "id"; // or use 'in'
        var country = "ID";
        var locale = new Locale(language, country);

        System.out.println(locale.getLanguage()); // in (old ISO Codes)
        System.out.println(locale.getCountry()); // id

        System.out.println(locale.getDisplayLanguage()); // Indonesian
        System.out.println(locale.getDisplayCountry()); // Indonesia
    }

    @Test
    void testNewLocaleUS() {
        var language = "en";
        var country = "US";
        var locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
