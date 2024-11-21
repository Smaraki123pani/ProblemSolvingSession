package com.demo.Day6;

import java.util.Scanner;

public class CountSort {

	//Max Array=9
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//create an array
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		countsort(arr);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

	

	}

	private static void countsort(int[] arr) {
		//max->
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];//update the max value 
			}
		}
		//create count array 
		int[] count=new int[max+1];
		
		//count the frenexy of every element in array
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
//		for(int i=0;i<count.length;i++) {
//			System.out.print(count[i] +  " ");
//		}
		
		//update the original array
		int index=0;
		for(int i=0;i<count.length;i++) {
			//it will place element in original in sorted format
			while(count[i]>0) {
				arr[index++]=i;
				count[i]--;//count->0 sto//0
			}
		}
		
		
	}
	
}
