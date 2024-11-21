// 1. Create a program to find the intersection of two sorted arrays.

package com.demo.Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first sorted array
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements for the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input for the second sorted array
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements for the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Finding the intersection
        ArrayList<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (array1[i] == array2[j]) {
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != array1[i]) {
                    intersection.add(array1[i]);
                }
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Output the result
        System.out.println("Intersection of the two arrays:");
        if (intersection.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            for (int num : intersection) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
