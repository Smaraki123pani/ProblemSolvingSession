package com.demo.Day8;

import java.util.Scanner;

//structure to store node like elements
class Noderd {
	int data;
	Noderd next;

//Constructor
	Noderd(int data) {
		this.data = data;
		this.next = null;
	}
}

class Lists {
	Noderd head;// first node in linked list

	// Insert data
	void insert(int data) {
		Noderd newnode = new Noderd(data);

		// Check if the list is empty
		if (head == null) {
			head = newnode;
		} else {
			Noderd temp = head;
			while (temp.next != null) {
				temp = temp.next; // Move to next node
			}
			temp.next = newnode;// set the new node at the end of list
		}

	}

	// Remove Duplicates
	public void removeDuplicates() {
		Noderd current = head;

		while (current != null) {
			Noderd runner=current;
			
			while (runner.next != null) {
				if(runner.next.data==current.data) {
					runner.next=runner.next.next; //Removing Duplicates
				}else {
					runner=runner.next;
				}
			}
			current=current.next;
			
		}

	}

	// Display data
	void display() {
		if (head == null) {
			System.out.println("The list is empty..");
			return;
		}

		Noderd temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println("null");

	}

}

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lists l = new Lists();

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			l.insert(element);
		}

		l.removeDuplicates();
		l.display();

		sc.close();
	}
}

//Time Complexity = 0(n)
//Space Complexity = 0(n)

