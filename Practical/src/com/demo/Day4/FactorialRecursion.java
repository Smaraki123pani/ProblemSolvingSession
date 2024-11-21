package com.demo.Day4;
import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("Factorial can't be determined ");
		}else {
			int res=fact(num);
			System.out.println(res);
		}	
	}

	private static int fact(int n) {
		
		if(n==0||n==1) {
			return 1;
		}else {
			//recursive solution
			return n*fact(n-1);
		}
	}

}

