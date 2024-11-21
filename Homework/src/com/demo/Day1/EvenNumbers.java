// 3. Create a program to generate the first n even numbers.

package com.demo.Day1;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of even numbers to generate
        System.out.print("Enter the value of n (number of even numbers to generate): ");
        int n = scanner.nextInt();

        // Generate and print the first n even numbers
        System.out.println("The first " + n + " even numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
