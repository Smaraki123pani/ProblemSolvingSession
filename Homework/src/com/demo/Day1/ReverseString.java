// 1. Write a program to reverse a string.


package com.demo.Day1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to reverse:");

        // Read the input string
        String inputString = scanner.nextLine();

        // Reverse the string using StringBuilder
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString.toString());

        // Close the scanner
        scanner.close();
    }
}
