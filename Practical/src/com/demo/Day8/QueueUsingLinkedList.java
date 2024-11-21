package com.demo.Day8;

import java.util.Scanner;

class Nodeq {
	// Node to store the element of linked list
	int data;
	Nodeq next;

	// constructor
	public Nodeq(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {
	private Nodeq front;
	private Nodeq rear;

	// constructor
	public Queue() {
		this.front = null;
		this.rear = null;
	}

	// insertion
	public void enqueue(int data) {
		Nodeq newnode = new Nodeq(data);
		if (rear == null) {
			front = rear = newnode;
		} else {
			rear.next = newnode;
			rear = newnode;
		}
		System.out.println(data + " enqueue into the queue.");
	}

	// remove an element -dequeue
	public int dequeue() {
		if (front == null) {
			System.out.println("Queue is empty.");
			return -1;
		}

		int value = front.data;

		front = front.next;// moving front next node
		if (front == null) {
			rear = null;
		}
		System.out.println(value + " dequeued from queue");
		return value;

	}

	// display of the element

	public void display() {
		if (front == null) {
			System.out.println("Queue is empty.");
			return;
		}
		Nodeq temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println();

	}

}

public class QueueUsingLinkedList {

	public static void main(String[] args) {

		// an object of Queue
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Choose an Operation..");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the value to enqueue");
				int value = sc.nextInt();
				q.enqueue(value);
				break;

			case 2:
				q.dequeue();
				break;
			case 3:
				q.display();
				break;

			case 4:
				System.exit(0);
				break;
			default:
				System.out.println(" ");
			}

		}

	}

}

// Time Complexity = 0(1)
//Space Complexity = 0(n)