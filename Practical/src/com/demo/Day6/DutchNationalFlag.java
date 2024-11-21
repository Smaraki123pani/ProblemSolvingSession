package com.demo.Day6;

import java.util.Scanner;
public class DutchNationalFlag {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			//create an array
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			dutchnationsorting(arr);
			displaysorted(arr);
			
		}

		private static void displaysorted(int[] arr) {
			for(int num:arr) {
				System.out.print(num + " ");
			}
			
		}

		private static void dutchnationsorting(int[] arr) {
			//declare 
			int low=0,mid=0,high=arr.length-1;
			while(mid<=high) {
				//if current element ->0,swap with low 
				if(arr[mid]==0) {
					swap(arr,low,mid);
					low++;
					mid++;
				}else if(arr[mid]==1) {
					mid++;//element is 1,move to next element
				}else {
					swap(arr,mid,high);//if element ->2,swap with high
					high--;	
				} 
			}
		}

		private static void swap(int[] arr, int i, int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}

	}



//	Time complexity:O(n)->linear time->
//	Space->O(1)



