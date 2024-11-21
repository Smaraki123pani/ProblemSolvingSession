// 2. Write a program to sort a half of element in ascending order.

package com.demo.Day5;

import java.util.*;

public class SortHalfOfArray {

    // Method to sort only the first half of the array
    public static void sortFirstHalf(int[] arr) {
        // Find the midpoint of the array
        int mid = arr.length / 2;

        // Sort the first half of the array
        Arrays.sort(arr, 0, mid);

        // Print the modified array with the first half sorted
        System.out.println("Array after sorting the first half:");
        System.out.println(Arrays.toString(arr));
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

        // Calling the method to sort the first half of the array
        sortFirstHalf(arr);

        scanner.close();
    }
}

