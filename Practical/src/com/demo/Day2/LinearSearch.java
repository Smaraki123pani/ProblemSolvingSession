//WAP to search an element in an array
//TC1:
//5
//5 12 7 9 3
//7
//
//output:2
//
//TC2:
//5
//8 4 2 9 5
//6
//Output:"Element not found in array"
//
//
//TC3:
//5
//3 8 1 9 6
//3
//Output:0


package com.demo.Day2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int size=sc.nextInt();//5
		//initialize an array
		int[] array=new int[size];//Heap memory location
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		int target=sc.nextInt();//take input from user which you compare with all element 	
		int index=-1;
		//logic
		for(int i=0;i<size;i++) {
			if(array[i]==target) {
				index=i;
				break;
			}
		}
		
		if(index!=-1) {
			System.out.println(index);
		}else {
			System.out.println("Target not found");
		}		
	}

}

//Linear search:
//TIme:
//Best-O(1)
//Worst-O(n)->search till last 
//Space:
//O(1)->few variable without other  memory