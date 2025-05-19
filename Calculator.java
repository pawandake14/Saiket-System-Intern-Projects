import java.util.Scanner;

public class Calculator {

    // Method to perform Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to perform Substraction
    public static double sub(double a, double b) {
        return a - b;
    }

    // Method to perform Multiplication
    public static double mul(double a, double b) {
        return a * b;
    }

    // Method to perform Division
    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not possible");    //If the entered number is 0 as a divisor then it will throw this line
        }
        return a / b;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Operations = true;

        while (Operations) {
            System.out.println("\nAvailable Operations");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter operations to be performed (1 -5): ");
            int operation = sc.nextInt();

            if (operation == 5) {
                Operations = false;
                System.out.println("\nExiting...");
                continue;
            }

            System.out.print("Enter first number:");
            double a = sc.nextDouble();

            System.out.print("Enter second number:");
            double b = sc.nextDouble();



            try {
                double result = 0;
                switch (operation) {
                    case 1:
                        result = add(a, b);
                        break;
                    case 2:
                        result = sub(a, b);
                        break;
                    case 3:
                        result = mul(a, b);
                        break;
                    case 4:
                        result = div(a, b);
                        break;
                    default:
                        throw new ArithmeticException("Invalid operation");
                }

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        sc.close();
    }
}
