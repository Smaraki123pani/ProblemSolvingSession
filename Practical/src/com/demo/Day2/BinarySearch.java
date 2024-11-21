//WAP to implement Binary search to search an element in an array
//
//Binary->
//Element must be in sorted array


package com.demo.Day2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int size=sc.nextInt();//5
		//initialize an array
		int[] array=new int[size];//Heap memory location
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}

		int target=sc.nextInt();//take input from user which you compare with all element 	

		
		//create a method
		int result=binarSearch(array,target);
		
		if(result!=-1) {
			System.out.println(result);
		}else {
			System.out.println("-1");
		}
	}

	private static int binarSearch(int[] array, int target) {
		//Logic
		int left=0;
		int right=array.length-1;//4
		
		while(left<=right) {
		int mid=left+(right-left)/2;
		
		if(array[mid]==target) {
			return mid;
		}else if(array[mid]<target) {
			left=mid+1;//new left pointer
		}else {
			right=mid-1;
		}
			
		}	
		return -1;//not available
	}

}


//Time Complexity:
//Worst-O(log n)->number elements is divided in halves
//. it will reduce to search an element compared to linear
//search
//
//Best-O(1)->mid->
//
//Space-O(1)
