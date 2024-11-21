// 1. Given a non-empty array of integers, return the k most frequent elements nums = [1, 1, 1, 2, 2, 3], k = 2.

package com.demo.Day5;

import java.util.*;

public class MostFrequentElements {

    // Method to find the k most frequent elements
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Create a frequency map to count the occurrences of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a priority queue to store elements by frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // Step 3: Add all entries from the frequency map to the max heap
        maxHeap.addAll(frequencyMap.entrySet());

        // Step 4: Extract the k most frequent elements from the max heap
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(maxHeap.poll().getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array of integers
        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int[] nums = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i].trim());
        }

        // Taking input for k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Finding the k most frequent elements
        List<Integer> result = topKFrequent(nums, k);

        // Printing the result
        System.out.println("The " + k + " most frequent elements are: " + result);

        scanner.close();
    }
}

