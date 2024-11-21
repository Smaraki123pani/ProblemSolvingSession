
//WAP to implement Ternary  search to search an element in an array
//
//[10,20,30,40,50,60,70]=?
//
//
//40
//
//Hint->
//Divide  into 3 parts and find out-2 mid points
//mid1
//
//mid2
//mid1=>left+(right-left)/3
//mid2=>right-(right-left)/3
//left=>0
//right->6
//mid1->2
//mid2->4


package com.demo.Day2;
import java.util.Scanner;

public class TernarySearch {

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
		int result=ternarysearch(array,0,array.length-1,target);
		
		if(result!=-1) {
			System.out.println(result);
		}else {
			System.out.println("-1");
		}
	}

	private static int ternarysearch(int[] array, int left, int right, int target) {
		if(right>=left) {
			//calculate mid pointers
			int mid1=left+(right-left)/3;
			int mid2=right-(right-left)/3;
			
			if(array[mid1]==target) {
				return mid1;
			}
			

			if(array[mid2]==target) {
				return mid2;
			}
			
			if(target<array[mid1]) {
				return ternarysearch(array,left,mid1-1,target);
			}else if(target>array[mid2]) {
				return ternarysearch(array,mid2+1,right,target);
			}else {
				return ternarysearch(array, mid1+1, mid2-1, target);//search in middle
			}
			
		}
		return -1;
	}

	

}
//Time->
//O(log3 n)
//Space:
//O(1)
