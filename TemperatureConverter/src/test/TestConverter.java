package test;
import org.junit.jupiter.api.Test;
import utils.Converter;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestConverter {

    @Test
    void celsiusToFahrenheit() {
        double temperature = 20.0;
        double conversion = Converter.CelsiusToFahrenheit(temperature);
        assertEquals(68.0, conversion);
    }

    @Test
    void fahrenheitToCelsius() {
        double temperature = 68.0;
        double conversion = Converter.FahrenheitToCelsius(temperature);
        assertEquals(20.0, conversion);
    }

    @Test
    void celsiusToKelvin() {
        double temperature = 20;
        double conversion = Converter.CelsiusToKelvin(temperature);
        assertEquals(293.15, conversion);
    }
}