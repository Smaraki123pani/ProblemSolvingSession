// 4.  Implement a program to find all permutations of a string using recursion.

package com.demo.Day4;

import java.util.*;

public class StringPermutations {

    // Method to find all permutations of the string
    public static void generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        // Convert string to character array for easy swapping
        char[] chars = str.toCharArray();
        // Call the recursive helper function
        permute(chars, 0, result);
        
        // Displaying the result
        System.out.println("All Permutations:");
        for (String perm : result) {
            System.out.println(perm);
        }
    }

    // Helper recursive method to generate permutations
    private static void permute(char[] chars, int index, List<String> result) {
        // If we've fixed all characters, add the current permutation to the result list
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        // Swap each character with the current index and recursively permute the rest
        for (int i = index; i < chars.length; i++) {
            // Swap characters at positions index and i
            swap(chars, index, i);
            // Recursively generate permutations for the next index
            permute(chars, index + 1, result);
            // Backtrack: swap back the characters to restore the original string
            swap(chars, index, i);
        }
    }

    // Method to swap two characters in an array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking string input from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Generating all permutations of the string
        generatePermutations(str);
        
        scanner.close();
    }
}
