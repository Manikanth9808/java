package com.tandemloop.screeningtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter numbers separated by space: "); // Enter the input example: 1 2 8 9 12 46 76 82 15 20 30
            String line = sc.nextLine();
            String[] inputs = line.trim().split("\\s+"); //split based on the whiteSpace

            int[] numbers = new int[inputs.length];
            for (int i = 0; i < inputs.length; i++) {
                numbers[i] = Integer.parseInt(inputs[i]);  //converting String to int.
            }

            Map<Integer, Integer> multiplesCount = new HashMap<>();

            for (int i = 1; i <= 9; i++) {  // Check multiples for 1 through 9
                int count = 0;
                for (int num : numbers) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                multiplesCount.put(i, count);
            }

           
            System.out.println(multiplesCount);  // Print  map

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            sc.close();  // Close the Scanner resource
        }
    }
}
