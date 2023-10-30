package Converter;
public class Converter {
    public static double CelsiusToFahrenheit(double temperature){
        return (temperature*1.8)+32;
    }
    public static double FahrenheitToCelsius(double temperature){
        return (5/9.0)*(temperature-32);
    }

    public static double CelsiusToKelvin(double temperature){
        return temperature + 273.15;
    }



}
