//4. Write a program to check if two arrays are permutations of each other.

package com.demo.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPermutationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Check if the arrays are permutations of each other
        if (arePermutations(array1, array2)) {
            System.out.println("The arrays are permutations of each other.");
        } else {
            System.out.println("The arrays are not permutations of each other.");
        }
    }

    // Method to check if two arrays are permutations of each other
    public static boolean arePermutations(int[] array1, int[] array2) {
        // If arrays have different lengths, they can't be permutations
        if (array1.length != array2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
