// 5. Write a program to implement a stack using a linked list.

package com.demo.Day8;

import java.util.Scanner;

class StackUsingLinkedList {
    Node top;

    // Node class representing each element in the stack
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push operation to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Pop operation to remove the top element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int poppedData = top.data;
            top = top.next;
            return poppedData;
        }
    }

    // Peek operation to get the top element of the stack without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return top.data;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print the elements of the stack
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackUsingLinkedList stack = new StackUsingLinkedList();

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Print Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    System.out.println("Element pushed.");
                    break;
                case 2:
                    int poppedData = stack.pop();
                    if (poppedData != -1) {
                        System.out.println("Popped element: " + poppedData);
                    }
                    break;
                case 3:
                    int topData = stack.peek();
                    if (topData != -1) {
                        System.out.println("Top element: " + topData);
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Current stack:");
                    stack.printStack();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}

