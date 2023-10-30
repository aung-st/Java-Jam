package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Converter.Converter;

class TestConverter {

    @Test
    void celsiusToFahrenheit() {
        double temperature = 20.0;
        double conversion = Converter.CelciusToFarenheit(temperature);
        assertEquals(68.0, conversion);
    }

    @Test
    void fahrenheitToCelsius() {
        double temperature = 68.0;
        double conversion = Converter.FarenheitToCelcius(temperature);
        assertEquals(20.0, conversion);
    }
}