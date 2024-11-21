// 6.Given a rotated sorted array and a target element, find the index of the target. If the target is not present, return -1. 
//For example, in the array [4, 5, 6, 7, 0, 1, 2], for the target 0, the index should be 4.

package com.demo.Day2;

import java.util.Scanner;

public class IndexOfTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the elements of the rotated sorted array
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target element to search
        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        // Find the index of the target element
        int targetIndex = search(array, target);
        System.out.println("The index of the target element is: " + targetIndex);
    }

    // Method to search for the target element in the rotated sorted array
    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        // Binary search to find the target element
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is the target
            if (array[mid] == target) {
                return mid;
            }

            // If the left part is sorted
            if (array[left] <= array[mid]) {
                // Check if the target is in the left part
                if (target >= array[left] && target < array[mid]) {
                    right = mid - 1;  // Target is in the left half
                } else {
                    left = mid + 1;   // Target is in the right half
                }
            } else {
                // If the right part is sorted
                // Check if the target is in the right part
                if (target > array[mid] && target <= array[right]) {
                    left = mid + 1;   // Target is in the right half
                } else {
                    right = mid - 1;  // Target is in the left half
                }
            }
        }

        return -1;  // Return -1 if the target is not found
    }
}

