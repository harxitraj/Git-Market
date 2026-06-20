import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Simple Java Calculator ===");

        while (running) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next(); // clear invalid input
                continue;
            }

            if (choice == 5) {
                running = false;
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = getDoubleInput(scanner);

            System.out.print("Enter second number: ");
            double num2 = getDoubleInput(scanner);

            double result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = divide(num1, num2);
                        System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, result);
                    }
                    break;
                default:
                    validOperation = false;
                    break;
            }
        }
        scanner.close();
    }

    private static double getDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}