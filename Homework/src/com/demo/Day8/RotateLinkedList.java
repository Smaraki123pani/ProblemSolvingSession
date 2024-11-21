// 3. Implement a program to rotate a linked list by k nodes.

package com.demo.Day8;

import java.util.Scanner;

class LinkedLists {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a new node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Rotate the linked list by k nodes
    public void rotateByK(int k) {
        if (head == null || k == 0) return;

        // Step 1: Find the length of the list
        Node temp = head;
        int length = 1; // Since we already have the head node
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        // If k is greater than the length of the list, reduce it to k % length
        k = k % length;
        if (k == 0) return;

        // Step 2: Find the (length - k)th node
        Node prev = null;
        Node current = head;
        for (int i = 0; i < length - k; i++) {
            prev = current;
            current = current.next;
        }

        // Step 3: Set the new head to the current node
        Node newHead = current;

        // Step 4: Traverse to the end and link the last node to the old head
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;  // Make the old head's next node the end of the list

        // Step 5: Set the previous node's next to null to break the cycle
        prev.next = null;

        // Update head to the new head
        head = newHead;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class RotateLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedLists list = new LinkedLists();

        // Input the number of nodes
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        // Input the elements of the linked list
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Input the number of rotations (k)
        System.out.print("Enter the number of nodes to rotate the linked list by: ");
        int k = scanner.nextInt();

        // Print the original linked list
        System.out.println("Original Linked List:");
        list.printList();

        // Rotate the linked list by k nodes
        list.rotateByK(k);

        // Print the rotated linked list
        System.out.println("Linked List after rotating by " + k + " nodes:");
        list.printList();

        scanner.close();
    }
}
