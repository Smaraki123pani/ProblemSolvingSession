// 1. Implement a program to generate combinations of parentheses.

package com.demo.Day4;

import java.util.*;

public class ParenthesesCombinations {

    // Method to generate all valid combinations
    public static void generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        
        // Displaying the result
        System.out.println("Valid Parentheses Combinations:");
        for (String combination : result) {
            System.out.println(combination);
        }
    }

    // Helper method to perform backtracking
    private static void backtrack(List<String> result, String current, int open, int close, int n) {
        // If the current combination is valid and complete
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add an opening parenthesis if possible
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Add a closing parenthesis if possible
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking the number of pairs as input
        System.out.print("Enter the number of pairs of parentheses: ");
        int n = scanner.nextInt();
        
        // Generating valid parentheses combinations
        generateParentheses(n);
        
        scanner.close();
    }
}
