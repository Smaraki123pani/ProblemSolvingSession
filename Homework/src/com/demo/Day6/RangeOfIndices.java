// 3. Write a program to search for a range of indices of an element in a sorted array.

package com.demo.Day6;

import java.util.Scanner;

public class RangeOfIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the elements of the sorted array
        System.out.println("Enter " + n + " sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target element
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Find the range of indices
        int[] range = findRange(array, target);

        // Output the range
        if (range[0] == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found from index " + range[0] + " to index " + range[1]);
        }

        scanner.close();
    }

    // Method to find the range of indices of the target element
    public static int[] findRange(int[] array, int target) {
        int[] result = {-1, -1}; // Initialize the range as not found

        // Find the first occurrence of the target
        result[0] = findFirstOccurrence(array, target);

        // Find the last occurrence of the target (only if first occurrence is found)
        if (result[0] != -1) {
            result[1] = findLastOccurrence(array, target);
        }

        return result;
    }

    // Helper method to find the first occurrence of the target
    public static int findFirstOccurrence(int[] array, int target) {
        int start = 0, end = array.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                result = mid;
                end = mid - 1; // Narrow down to the left side
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    // Helper method to find the last occurrence of the target
    public static int findLastOccurrence(int[] array, int target) {
        int start = 0, end = array.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                result = mid;
                start = mid + 1; // Narrow down to the right side
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}

