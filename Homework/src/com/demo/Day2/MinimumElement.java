// 5. Given a rotated sorted array, find the minimum element. Assume there are no duplicate elements in the array. 
//For example, in the array [4, 5, 6, 7, 0, 1, 2], the minimum element is 0.

package com.demo.Day2;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the minimum element in the rotated sorted array
        int minElement = findMin(array);
        System.out.println("The minimum element in the rotated sorted array is: " + minElement);
    }

    // Method to find the minimum element in a rotated sorted array
    public static int findMin(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Binary search to find the minimum element
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the minimum element
            if (mid > 0 && array[mid] < array[mid - 1]) {
                return array[mid];
            } else if (array[mid] >= array[left]) {
                // If the left side is sorted, the minimum is on the right side
                left = mid + 1;
            } else {
                // If the right side is sorted, the minimum is on the left side
                right = mid - 1;
            }
        }
        return array[0]; // If no rotation is detected, the first element is the minimum
    }
}
