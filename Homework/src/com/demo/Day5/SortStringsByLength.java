// 4. Implement a program to sort an array of strings by length.

package com.demo.Day5;

import java.util.*;

public class SortStringsByLength {

    // Method to sort the array of strings by length
    public static void sortByLength(String[] arr) {
        // Sorting the array using a custom comparator that compares the length of strings
        Arrays.sort(arr, (str1, str2) -> Integer.compare(str1.length(), str2.length()));

        // Printing the sorted array
        System.out.println("Array after sorting by length:");
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String[] arr = new String[n];

        // Taking input for the strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        // Calling the method to sort the strings by length
        sortByLength(arr);

        scanner.close();
    }
}


