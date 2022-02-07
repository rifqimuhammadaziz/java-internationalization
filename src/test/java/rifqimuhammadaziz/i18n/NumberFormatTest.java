package rifqimuhammadaziz.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    // FORMAT

    @Test
    void testNumberFormat() {
        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(10000000.255);
        System.out.println(format); // default US : 10,000,000.255
    }

    @Test
    void testNumberFormatIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(10000000.255);
        System.out.println(format); // Indonesia : 10.000.000,255
    }

    // PARSE

    @Test
    void testNumberParse() {
        var numberFormat = NumberFormat.getInstance();

        try {
            var result = numberFormat.parse("10,250").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }

    @Test
    void testNumberParseIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);

        try {
            var result = numberFormat.parse("10.000.000,120").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
