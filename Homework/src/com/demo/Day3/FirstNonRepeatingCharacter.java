// 5. Given a string s, find the first non-repeating character in it and return its index. 
//If it doesn't exist, return -1. For example, for s = "leetcode", the output should be 0.

package com.demo.Day3;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Find the first non-repeating character
        int result = firstUniqChar(s);

        // Output the result
        System.out.println("The index of the first non-repeating character is: " + result);
    }

    // Method to find the index of the first non-repeating character
    public static int firstUniqChar(String s) {
        // HashMap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse the string to populate the frequency map
        for (int i = 0; i < s.length(); i++) {
            frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Traverse the string again to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;  // Return the index of the first non-repeating character
            }
        }

        return -1;  // If no non-repeating character exists, return -1
    }
}
