import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        
        System.out.print("Enter first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a number.");
            return;
        }
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a number.");
            return;
        }
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break;
        }
        
        scanner.close();
    }
}