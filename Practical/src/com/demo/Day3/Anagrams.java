//WAP to check if 2 strings are anagrams or not
//
//Tc1:
//listen
//silent
//
//Output:"Anagram"
//
//Tc2:
//abcd
//abc
//
//Output"Not Anagrams"
//
//TC3:
//input: 
//aabbcc
//ccbbac
//
//Output:Anagrams

package com.demo.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
	boolean	result=checkanagrams(str1,str2);
	
	if(result) {
		System.out.println("Anagrams");
	}else {
		System.out.println("Not Anagrams");
	}

	}

	private static boolean checkanagrams(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		//convert string into char array
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		
		//sort the both array and compare
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);

	}

}