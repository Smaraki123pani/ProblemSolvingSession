// 3. Write a program to left rotate an array by one position.

package com.demo.Day2;

import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform left rotation by one position
        leftRotateByOne(array);

        // Print the array after rotation
        System.out.println("Array after left rotation by one position:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Method to perform left rotation by one position
    public static void leftRotateByOne(int[] array) {
        int n = array.length;
        if (n == 0) return; // Edge case: empty array

        // Store the first element
        int first = array[0];

        // Shift elements to the left
        for (int i = 1; i < n; i++) {
            array[i - 1] = array[i];
        }

        // Place the first element at the end
        array[n - 1] = first;
    }
}
