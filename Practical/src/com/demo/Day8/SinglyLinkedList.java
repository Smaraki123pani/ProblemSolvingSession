package com.demo.Day8;

import java.util.Scanner;

//structure to store node like elements
class Node{
	int data;
	Node next;
	
	//constructor 
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class SinglyLinkedList {
	Node head;//first node in linked list
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList ll=new SinglyLinkedList();
		int n=sc.nextInt();
		
		//insert the data
		for(int i=0;i<n;i++) {
			int element=sc.nextInt();
			ll.insert(element);
		}	
		ll.display();
	}

	
//insert the data
	void insert(int data) {
		Node newnode=new Node(data);
		//check if the list is empty
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;//move to next node
			}
		temp.next=newnode;//set the new node at the end of list
		}
		
	}
	
	//display
		void display() {
			if(head==null) {
				System.out.println("The list is empty..");
				return ;
			}
			Node temp=head;
			
			while(temp!=null) {
				System.out.print(temp.data + "->");
				temp=temp.next;
			}
			
			System.out.println("null");
			
		}

}
