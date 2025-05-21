package com.tandemloop.screeningtest;
import java.util.Scanner;

class Calculator {  // Calculator class with basic arithmetic operations
 
    public static double add(double a, double b) {   // Method to perform addition
        return a + b; 
    }

    public static double subtract(double a, double b) {  // Method to perform subtraction
        return a - b; 
    }

    public static double multiply(double a, double b) {  // Method to perform multiplication
        return a * b; 
    }
    
    public static double divide(double a, double b) {   // Method to perform division, with check for division by zero
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }
}


public class Problem1 { // Main class to interact with user and perform calculation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        try {
        	// Taking user input
            System.out.print("Enter first number (a): ");
            double a = sc.nextDouble();

            System.out.print("Enter second number (b): ");
            double b = sc.nextDouble();

            System.out.print("Enter operation (add, sub, mul, div): ");
            String operation = sc.next();

            double result;

            
            switch (operation) { // Deciding which operation to perform
                case "add":
                    result = Calculator.add(a, b);
                    break;
                case "sub":
                    result = Calculator.subtract(a, b);
                    break;
                case "mul":
                    result = Calculator.multiply(a, b);
                    break;
                case "div":
                    result = Calculator.divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operation");
                    return;
            }

           
            System.out.println("Result: " + result);  // Printing the result
        } catch (ArithmeticException e) {
          
            System.out.println("Error: " + e.getMessage());   // Catching specific arithmetic exceptions (like division by zero)
        } catch (Exception e) {
           
            System.out.println("Unexpected error occurred: " + e.getMessage());  // Catching any other unexpected exceptions
        } finally {
            sc.close(); // Closing the scanner to avoid memory leaks
        }
    }
}
