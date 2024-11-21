// 4. Implement a program to convert a string to title case.

package com.demo.Day3;

import java.util.Scanner;

public class TitleCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to title case
        String titleCaseString = convertToTitleCase(input);

        // Output the result
        System.out.println("The string in title case is: " + titleCaseString);
    }

    // Method to convert a string to title case
    public static String convertToTitleCase(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter and make the rest lowercase
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
            }
        }

        // Trim the trailing space and return the result
        return titleCase.toString().trim();
    }
}

