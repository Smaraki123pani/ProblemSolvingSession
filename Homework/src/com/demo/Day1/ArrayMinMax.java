// 4. Write a program to find the maximum and minimum of an array.

package com.demo.Day1;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to hold the elements
        int[] numbers = new int[size];

        // Read the elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Traverse the array to find the maximum and minimum
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Display the results
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        // Close the scanner
        scanner.close();
    }
}

