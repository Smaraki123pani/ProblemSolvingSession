// 2. Implement a program to find the next greater element for each element in an array using a stack.

package com.demo.Day7;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the next greater elements
        int[] nextGreater = findNextGreaterElements(array);

        // Output the next greater elements
        System.out.println("Next greater elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " -> " + (nextGreater[i] == -1 ? "None" : nextGreater[i]));
        }

        scanner.close();
    }

    // Method to find the next greater element for each element in the array
    public static int[] findNextGreaterElements(int[] array) {
        int n = array.length;
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        // Initialize all elements in the result array to -1 (default value)
        for (int i = 0; i < n; i++) {
            nextGreater[i] = -1;
        }

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from the stack that are smaller or equal to the current element
            while (!stack.isEmpty() && array[stack.peek()] <= array[i]) {
                stack.pop();
            }

            // If the stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                nextGreater[i] = array[stack.peek()];
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return nextGreater;
    }
}
