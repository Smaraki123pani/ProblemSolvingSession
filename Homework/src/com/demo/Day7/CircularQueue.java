// 1. Create a program to implement a circular queue.

package com.demo.Day7;

import java.util.Scanner;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize the circular queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Method to add an element to the queue (Enqueue)
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + element);
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        System.out.println("Inserted " + element + " into the queue.");
    }

    // Method to remove an element from the queue (Dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int element = queue[front];
        if (front == rear) { // Queue becomes empty after this operation
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        System.out.println("Removed " + element + " from the queue.");
        return element;
    }

    // Method to display the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the circular queue
        System.out.print("Enter the size of the circular queue: ");
        int capacity = scanner.nextInt();
        CircularQueue cq = new CircularQueue(capacity);

        // Menu-driven program for queue operations
        while (true) {
            System.out.println("\n--- Circular Queue Operations ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    cq.enqueue(element);
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.display();
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

//The program correctly handles enqueue, dequeue, and display operations for the circular queue, 
//maintaining the queue size and wrapping around indices.
