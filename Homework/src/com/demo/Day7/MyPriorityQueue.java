// 3. Create a program to implement a priority queue.

package com.demo.Day7;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a PriorityQueue (min-heap by default)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Menu-driven program for priority queue operations
        while (true) {
            System.out.println("\n--- Priority Queue Operations ---");
            System.out.println("1. Insert an element");
            System.out.println("2. Remove the highest priority element (smallest element)");
            System.out.println("3. Display all elements in the queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    priorityQueue.offer(element);
                    System.out.println("Inserted " + element + " into the priority queue.");
                    break;

                case 2:
                    if (priorityQueue.isEmpty()) {
                        System.out.println("Priority queue is empty. Nothing to remove.");
                    } else {
                        int removedElement = priorityQueue.poll();
                        System.out.println("Removed the highest priority element: " + removedElement);
                    }
                    break;

                case 3:
                    if (priorityQueue.isEmpty()) {
                        System.out.println("Priority queue is empty.");
                    } else {
                        System.out.println("Elements in the priority queue: " + priorityQueue);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

