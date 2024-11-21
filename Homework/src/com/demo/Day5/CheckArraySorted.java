// 5. Write a program to check if an array is sorted.

package com.demo.Day5;

import java.util.*;

public class CheckArraySorted {

    // Method to check if the array is sorted in ascending order
    public static boolean isArraySorted(int[] arr) {
        // Loop through the array and check if each element is less than or equal to the next element
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;  // Array is not sorted
            }
        }
        return true;  // Array is sorted
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calling the method to check if the array is sorted
        if (isArraySorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        scanner.close();
    }
}
