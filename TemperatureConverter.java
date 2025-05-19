import java.util.Scanner;

public class TemperatureConverter {
    // Method to convert Celsius into Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert fahrenheit into celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loopRun = true;

        while (loopRun) {
            System.out.println("\nTemperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1 - 3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Result: " + celsiusToFahrenheit(celsius) + "ºF");
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println("Result: " + fahrenheitToCelsius(fahrenheit) + "ºC");
                    break;
                case 3:
                    loopRun = false;
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        sc.close();
    }
}
