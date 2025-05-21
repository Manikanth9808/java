package com.tandemloop.screeningtest;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");// Ask user for input
            int n = sc.nextInt();

            System.out.println("Output: ");
            
            if(n<=0) { // if user enters negative number.
            System.out.print("Please enter a positive integer.");
            }
            else {
            	for (int i = 0; i < n; i++) {
                int oddNumber = 2 * i + 1; // Formula to generate odd numbers
                System.out.print(oddNumber+" ");
            	}
            }
            
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}
