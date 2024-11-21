// 2. Implement a program to find the maximum element in a circular sorted array.

package com.demo.Day6;

import java.util.Scanner;

public class MaxInCircularSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the circular sorted array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the elements of the circular sorted array
        System.out.println("Enter the elements of the circular sorted array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the maximum element
        int maxElement = findMax(array);

        // Output the maximum element
        System.out.println("The maximum element in the circular sorted array is: " + maxElement);

        scanner.close();
    }

    // Method to find the maximum element in a circular sorted array
    public static int findMax(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Binary search approach
        while (start <= end) {
            // If the array segment is already sorted
            if (array[start] <= array[end]) {
                return array[end];
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % array.length; // Next element (circular)
            int prev = (mid - 1 + array.length) % array.length; // Previous element (circular)

            // Check if mid is the maximum
            if (array[mid] >= array[next] && array[mid] >= array[prev]) {
                return array[mid];
            }

            // Decide which side to search
            if (array[mid] >= array[start]) {
                start = mid + 1; // Move to the unsorted half
            } else {
                end = mid - 1; // Move to the unsorted half
            }
        }

        return -1; // This should never be reached for a valid circular sorted array
    }
}
