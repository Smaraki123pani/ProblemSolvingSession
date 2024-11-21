package com.demo.Day2;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int size=sc.nextInt();//5
		//initialize an array
		int[] array=new int[size];//Heap memory location
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		int[] resultarray=removeduplicates(array);
//		System.out.println(resultarray);
		for(int element:resultarray) {
			System.out.print(element + " ");
		}
	}

	private static int[] removeduplicates(int[] array) {
		//use HashSet class		
		HashSet<Integer> uniqelement=new HashSet<>();
		//element->HashSet
		for(int element:array) {
			uniqelement.add(element);
		}
		//convert element from Hashset to array
		int[] uniqarray=new int[uniqelement.size()];
		int index=0;
		for(int element:uniqelement) {
			uniqarray[index++]=element;
		}
		return uniqarray;
	}

}


//Time->O(n)
//Space->O(n)->created unique array to store the element




