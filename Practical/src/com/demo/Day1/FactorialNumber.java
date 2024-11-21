//WAP to find the factorial of number
//A factorial is multiplication of Natural number.->1 to n-> 
//TC1:
//input:5
//output:120
//
//Tc2:
//input:-3
//Output:Factorial Can't be defined
//
//TC3:
//input:0
//Output:1
//
//TC4:
//Input:20
//output:2432902008176640000



package com.demo.Day1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("Factorial Can't be determined");
		}else {
			long fact=1;
			
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			
			System.out.println(fact);
		}

	}

}

