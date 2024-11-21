// 1. Write a program to find the second largest element in an array.

package com.demo.Day2;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Ensure the array has at least two elements
        if (size < 2) {
            System.out.println("Array size must be at least 2.");
            return;
        }

        // Create an array to hold the elements
        int[] numbers = new int[size];

        // Read the elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables to find the largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the two largest elements
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        // Check if a valid second largest element exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }

        // Close the scanner
        scanner.close();
    }
}
