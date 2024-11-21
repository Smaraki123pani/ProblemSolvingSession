// 1. Create a program to remove duplicates from a linked list.

package com.demo.Day8;

import java.util.HashSet;
import java.util.Scanner;

class LinkedList {
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

	// Remove duplicates using a HashSet
	public void removeDuplicatesWithHashSet() {
		if (head == null)
			return;

		HashSet<Integer> seen = new HashSet<>();
		Node current = head;
		Node prev = null;

		while (current != null) {
			if (seen.contains(current.data)) {
				// Duplicate found, skip the node
				prev.next = current.next;
			} else {
				seen.add(current.data);
				prev = current;
			}
			current = current.next;
		}
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

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList list = new LinkedList();

		// Input the number of nodes
		System.out.print("Enter the number of elements in the linked list: ");
		int n = scanner.nextInt();

		// Input the elements of the linked list
		System.out.println("Enter the elements of the linked list:");
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		// Display the original list
		System.out.println("Original Linked List:");
		list.printList();

		list.removeDuplicatesWithHashSet();

		// Display the modified list
		System.out.println("Linked List after removing duplicates:");
		list.printList();

		scanner.close();
	}
}
