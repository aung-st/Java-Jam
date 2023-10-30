package Converter;
public class Converter {
    public static double CelciusToFarenheit(double temperature){
        return (temperature*1.8)+32;
    }
    public static double FarenheitToCelcius(double temperature){
        return (5/9.0)*(temperature-32);
    }

}
