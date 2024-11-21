package com.demo.Day6;

import java.util.Scanner;

public class SortZerosAndOnes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//create an array
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		sortingzerosandones(arr);
		displaysorted(arr);

	}

	private static void displaysorted(int[] arr) {
		for(int num:arr) {
			System.out.print(num + " ");
		}
		
	}

	private static void sortingzerosandones(int[] arr) {
		int low=0,high=arr.length-1;
		
		while(low<=high) {
			if(arr[low]==0) {
				low++;//moving low pointer
			}else if(arr[high]==1) {
				high--;//move high pointer
			}else {
				
				//swap low with high
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				//move both low 
				low++;
				high--;
			}
		}
		
	}

}
