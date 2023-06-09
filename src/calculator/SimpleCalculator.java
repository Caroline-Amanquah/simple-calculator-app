package calculator;
import java.util.Scanner;


public class SimpleCalculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
    
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
    
        System.out.println("Choose an operation (+, -, *, /):");
        String operation = scanner.next();
    
        double result;
    
        switch (operation) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }
    
        System.out.println("The result is: " + result);
    
        scanner.close();
    }
    
    }

