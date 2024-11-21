// 3. Create a program to check if a string is a rotation of another string.

package com.demo.Day3;

import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if str2 is a rotation of str1
        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }

    // Method to check if str2 is a rotation of str1
    public static boolean isRotation(String str1, String str2) {
        // If the lengths of the two strings are not equal, return false
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself and check if str2 is a substring of this concatenated string
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}

