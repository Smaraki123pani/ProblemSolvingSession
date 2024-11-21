//WAP to implement and print Fibonacci Series as per given tc
//Input:
//5
//output:
//0 1 1 2 3
//Input:1
//output:0
//
//Input:2
//output:0 1
//
//input:-3
//output:Please enter positive value
//
//Input:10
//output:0 1 1 2 3 5 8 13 21 34

package com.demo.Day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		int terms=sc.nextInt();//
		if(terms<=0) {
			System.out.println("-1");
		}else {
			
			//
			int first=0,second=1;
			
			for(int i=1;i<=terms;i++) {
				System.out.print(first+" ");
				int next=first+second;//1 unit
				first=second;//1unit
				second=next;//1unit
			}
			
		}
		

	}

}

//Time complexity:O(n)
//Space Complexity:O(1)

