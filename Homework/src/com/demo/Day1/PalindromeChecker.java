// 5. Develop a program to check if a string is a palindrome.

package com.demo.Day1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniformity
        String cleanedString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        // Check if the cleaned string is equal to its reverse
        if (cleanedString.equals(reversedString)) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}

