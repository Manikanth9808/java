package com.tandemloop.screeningtest;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n <= 0) { //if user enters the negative number
                System.out.println("Please enter a positive integer.");
            } else {
                // If n is even, make it  odd numbers, if odd, print n odd numbers
                int count = (n % 2 == 0) ? n - 1 : n; //to check the condition i used the ternary operator.

                System.out.print("Output: ");
                for (int i = 0; i < count; i++) {
                    int oddNumber = 2 * i + 1;  // Generate the i_th odd number
                    System.out.print(oddNumber + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Invalid input, Please enter an integer");
        } finally {
            sc.close(); //close the Scanner resource
        }
    }
}
