//WAP to implement the rotation of an array by n elements
//TC1:
//array with rotation less than array size.
//Input:
//[1,2,3,4,5],k=2
//
//Output:
//[4,5,1,2,3]
//
//
//TC2:
//[1,2,3,4,5] k=5
//[5,4,3,2,1]
//
//TC3:Rotation greater than array size
//input:[1,2,3,4,5] ,k=7
//
//k%n=>7%5=2->it is equivalent to rotate an array by  2 position
//output=>[4,5,1,2,3]
//
//
//TC4:Single  element
//input:[100],k=3
//
//Output=>[100]

package com.demo.Day3;

import java.util.Scanner;

public class Rotationarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int size=sc.nextInt();//5
		//initialize an array
		int[] array=new int[size];//Heap memory location
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		//position-k element
		int k=sc.nextInt();
		
		rotateArray(array,k);
		
		for(int element:array) {
			System.out.print(element +" ");
		}
	}

	private static void rotateArray(int[] array, int k) {
		int n=array.length;
		//manage rotation->k value greater size
		k=k%n;
		reverse(array,0,n-1);//reverse entire array
		reverse(array,0,k-1);////reverse first k element
		reverse(array,k,n-1);//reverse the remaining 
	}

	private static void reverse(int[] array, int start, int end) {
		while(start<end) {
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		
	}

}

