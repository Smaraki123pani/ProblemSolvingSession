// 2. Implement a program to merge two sorted arrays.

package com.demo.Day2;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the size of the first sorted array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        System.out.print("Enter the size of the second sorted array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Merge the two sorted arrays
        int[] mergedArray = mergeSortedArrays(array1, array2);

        // Output the merged array
        System.out.println("The merged sorted array is:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    // Method to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge arrays while elements remain in both arrays
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy any remaining elements from array1
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }

        // Copy any remaining elements from array2
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
