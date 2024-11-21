package com.demo.Day1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		int num=sc.nextInt();//8
		boolean isPrime=true;//assume that number is prime
		//logic
		if(num<=1) {
			isPrime=false;//not a prime
		}else {
			//start loop from 2
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime=false;//no 
					break;
				}
			}
		}
		//
		if(isPrime) {
			System.out.println(num +" is a prime number");
		}else {
			System.out.println(num +" is not a prime number");
		}
	}

}

