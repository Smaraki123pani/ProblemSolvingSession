//Write a program to replace all spaces in a string with '%20'.
//input:
//
//Smaraki Pani
//Smaraki%20Pani
//
//without using replace function.

package com.demo.Day4;

import java.util.Scanner;

public class StringSpaceReplacement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text= sc.nextLine();

		String res=replaceSpace(text);
		System.out.println(res);
	}

	private static String replaceSpace(String text) {		
		//create StringBuffer object
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			
			//logic
			if(ch==' ') {
				sb.append("%20");
			}else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}