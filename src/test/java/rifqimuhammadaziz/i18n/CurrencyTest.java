package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrencyIndonesia() {
        var indonesia = new Locale("id", "ID"); // currency must use country
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName()); // Indonesia Rupiah
        System.out.println(currency.getCurrencyCode()); // IDR
        System.out.println(currency.getSymbol(indonesia)); // Rp
    }

    @Test
    void testCurrencyUS() {
        var america = new Locale("en", "US"); // currency must use country
        var currency = Currency.getInstance(america);

        System.out.println(currency.getDisplayName()); // US Dollar
        System.out.println(currency.getCurrencyCode()); // USD
        System.out.println(currency.getSymbol(america)); // $
    }

    // Format
    @Test
    void testNumberFormatCurrencyIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(10000000.299); // Rp10.000.000,00
        System.out.println(format);
    }

    // Parse
    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            var parse = numberFormat.parse("Rp256.000.000,30").doubleValue(); // 2.560000003E8
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
