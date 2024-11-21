//Write a code to rotate the given string by the given number of times.
//
//input:
//hello 9
//Output:
//lohel
//
//substring


package com.demo.Day4;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();

		//rotation
		int rotation=sc.nextInt();
		
		int length=str.length();
		
		rotation=rotation%length;//length of string is grater than rotation
		
		//rotate the string
	String rotatedstring=str.substring(rotation)+str.substring(0,rotation);
	System.out.println(rotatedstring);
	}

}

