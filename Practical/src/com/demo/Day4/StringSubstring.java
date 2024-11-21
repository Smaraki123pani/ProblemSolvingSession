//Brute Force Approach->
//WAP to implement the concept with given data
//
//input:
//hello world
//world
//
//Output:6
//
//
//input:
//testing algorithm
//algo
//Output:8

package com.demo.Day4;

import java.util.Scanner;

public class StringSubstring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String substr=sc.nextLine();
	int res=	searchSubstring(str,substr);
	if(res!=-1) {
		System.out.println(res);
	}else {
		System.out.println("-1");
	}
		

	}

	private static int searchSubstring(String str, String substr) {
		for(int i=0;i<=str.length()-substr.length();i++) {
			boolean found=true;
			
			//compare char by char both string to check if string 
			for(int j=0;j<substr.length();j++) {
				if(str.charAt(i+j)!=substr.charAt(j)) {
					found=false;
					break;
				}
			}
			
			if(found) {
				return i;
			}
		}
		
		return -1;//no matching substring
		
	}

}
