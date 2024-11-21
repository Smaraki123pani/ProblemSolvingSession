//Recursion:
//What is recursion?
//Recursion:
//base condition->
//
//termination condition or Recursive case
//
//Stack memory internally->
//Stack memory is limited->
//
//
//fibonacci series
//Input:
//10th terms
//Output:
//0 1 1 2 3 5 8 13 21 34

package com.demo.Day4;
import java.util.Scanner;

public class RecursionFibonacci {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int nthterm=sc.nextInt();
			
			for(int i=0;i<nthterm;i++) {
				System.out.print(fib(i)+" ");
			}

		}
	//Stack memory->Recursive solution
		private static int fib(int n) {
			if(n==0) {
				return 0;
			}else if(n==1) {
				return 1;
			}else {
				return fib(n-1)+fib(n-2);//recurive solution
			}
			
		}

	}


