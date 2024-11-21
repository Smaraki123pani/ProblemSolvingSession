package com.demo.Day7;

import java.util.Scanner;

class Stack{
	private int arr[];//array to store stack elements
	private int top;//top element in stack
	private int capacity;
	
	//constructor
	public Stack(int size) {
		arr=new int[size];
		capacity=size;
		top=-1;//empty stack
		
	}

	//push->insert element into stack
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack overflow....");
			return;
		}
		arr[++top]=element;	
		System.out.println("pushed "+element+" to stack");
	}
	
	
	//Remove an element from stack
	
	public boolean isFull() {
		return top==capacity-1;//full->overflow
	}
	
	public boolean isEmpty() {
		return top==-1;//empty->underflow
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow..");
			return -1;
		}
		return arr[top--];//remove top element and decrement top index
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty..");
			return -1;
		}
		return arr[top];//return top element in stack
		
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.println("Print the element of stack: ");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
}

public class StackUsingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();//5
		
		
		Stack st=new Stack(size);
		
		//Menu driven
		while(true) {
			System.out.println("Choose an Operation below");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");

			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element to push :");
				int element=sc.nextInt();
				st.push(element);
				break;
				
			case 2:
				int elementremoval=st.pop();
				if(elementremoval!=-1) 
					System.out.println("Removed element "+elementremoval);
				   break;
			
			case 3:
				int topelement=st.peek();
				if(topelement!=-1) 
					System.out.println("Top element "+topelement);
				   break;
				   
			case 4:
				st.display();
				break;
			
			case 5:
				System.out.println("Exit from program");
				System.exit(0);
				
			default:
				System.out.println("Invalid choice. Enter 1 to 5 case number");
				break;
				
			}

		}
	}

}

