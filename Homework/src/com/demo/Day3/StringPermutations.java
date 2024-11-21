//2. Implement a program to find all permutations of a string.

package com.demo.Day3;

import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Generate and print all permutations
        System.out.println("All permutations of the string are:");
        generatePermutations(str, 0, str.length() - 1);
    }

    // Method to generate all permutations of a string
    public static void generatePermutations(String str, int left, int right) {
        // If the left index is equal to the right, print the permutation
        if (left == right) {
            System.out.println(str);
        } else {
            // Generate permutations by swapping each character
            for (int i = left; i <= right; i++) {
                // Swap characters at positions left and i
                str = swap(str, left, i);

                // Recursively generate permutations for the remaining part of the string
                generatePermutations(str, left + 1, right);

                // Backtrack to restore the string to its original state
                str = swap(str, left, i);
            }
        }
    }

    // Helper method to swap characters at positions i and j in a string
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}

