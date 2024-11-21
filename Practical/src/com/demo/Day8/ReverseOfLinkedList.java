package com.demo.Day8;

import java.util.Scanner;

//structure to store node like elements
class Noder{
	int data;
	Noder next;
	
	//constructor 
	Noder(int data){
		this.data=data;
		this.next=null;
	}
}

class Linkedlist{
	Noder head;//first node in linked list
	
	//insert the data
	void insert(int data) {
		Noder newnode=new Noder(data);
		
		//check if the list is empty
		if(head==null) {
			head=newnode;
		}else {
			Noder temp=head;
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
				Noder temp=head;
				
				while(temp!=null) {
					System.out.print(temp.data + "->");
					temp=temp.next;
				}
				
				System.out.println("null");
				
			}

		   public void reverse() {
				Noder prev=null;
				Noder curr=head;
				Noder nextnode;
				
				while(curr!=null) {
					nextnode=curr.next;
					curr.next=prev;
					prev=curr;
					curr=nextnode;
				}
				head=prev;
				
			}

}
public class ReverseOfLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Linkedlist ll=new Linkedlist();
		int n=sc.nextInt();
		
		//insert the data
			for(int i=0;i<n;i++) {
				int element=sc.nextInt();
				ll.insert(element);
			}	
			
			ll.reverse();
			ll.display();
	}

}

//Time Complexity = 0(n)
//Space Complexity = 0(1)

