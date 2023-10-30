import utils.Converter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        // Print conversion options
        Scanner conversion = new Scanner(System.in);
        System.out.println("1: Celsius to fahrenheit ");
        System.out.println("2: Fahrenheit to celsius");
        System.out.println("3: Celsius to kelvin ");
        System.out.println("4: kelvin to celsius ");

        // Input desired conversion
        System.out.println("Enter Option: ");
        int option = conversion.nextInt();  // Read user input

        // Input temperature for conversion
        Scanner toConvert = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        double temperature = toConvert.nextDouble();

        // Select desired conversion from Converter class
        switch (option) {
            case 1:
                System.out.println(Converter.CelsiusToFahrenheit(temperature));
                break;
            case 2:
                System.out.println(Converter.FahrenheitToCelsius(temperature));
                break;
            case 3:
                System.out.println(Converter.CelsiusToKelvin(temperature));
                break;
            case 4:
                System.out.println(Converter.KelvinToCelsius(temperature));
                break;
        }
    }
}
