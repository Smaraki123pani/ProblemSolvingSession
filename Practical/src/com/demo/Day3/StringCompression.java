package com.demo.Day3;
//String Compression

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
	String result=	getCompressed(str);
	System.out.println(result);

	}

	private static String getCompressed(String str) {
		StringBuilder sb=new StringBuilder();
		int count=1;//first charcater count will be 1
		
		for(int i=1;i<=str.length();i++) {
			if(i<str.length()&& str.charAt(i)==str.charAt(i-1)) {
				count++;
			}else {
				sb.append(str.charAt(i-1));
				sb.append(count);
				
				//next character 
				count=1;
			}
		}
		
//		return sb.length()<str.length()?sb.toString():str;
		
		return sb.toString();
		
	}

}
