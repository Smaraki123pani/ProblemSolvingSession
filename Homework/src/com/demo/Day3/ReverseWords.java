// 1. Write a program to reverse the words in a sentence.

package com.demo.Day3;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Reverse the words in the sentence
        String reversedSentence = reverseWords(sentence);

        // Output the reversed sentence
        System.out.println("The sentence with reversed words is:");
        System.out.println(reversedSentence);
    }

    // Method to reverse the words in a sentence
    public static String reverseWords(String sentence) {
        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        // Traverse the words array from the end to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);

            // Append a space between words except after the last word
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
