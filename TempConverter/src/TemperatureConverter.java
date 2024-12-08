import java.util.Scanner;

public class TemperatureConverter {
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice;
        
        while (true) {
            System.out.println("Enter 1 to convert Celsius to Fahrenheit");
            System.out.println("Enter 2 to convert Fahrenheit to Celsius");
            System.out.println("Enter 3 to exit");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid choice");
                scanner.next();
            }

            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter temperature in Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter temperature in Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
            scanner.close();
        }
    }
}
