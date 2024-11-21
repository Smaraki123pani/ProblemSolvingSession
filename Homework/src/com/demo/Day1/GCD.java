// 2.Implement a program to find the GCD of two numbers.

package com.demo.Day1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the gcd method to find the GCD
        int gcd = findGCD(num1, num2);

        // Display the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

