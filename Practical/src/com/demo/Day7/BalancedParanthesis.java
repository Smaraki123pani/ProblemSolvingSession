package com.demo.Day7;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  String exprs=sc.nextLine();
	  
	  //create method 
	 boolean res= isbalanced(exprs);
	 if(res) {
		 System.out.println("Balanced Parenthesis");
	 }else {
		 System.out.println("Not Balanced Parenthesis");
	 }
	}

	private static boolean isbalanced(String exprs) {
	Stack<Character> st=new Stack<>();
	
	for(int i=0;i<exprs.length();i++) {
		char ch=exprs.charAt(i);
		
		if(ch=='('||ch=='{'|| ch=='[') {
			st.push(ch);
		}
		else if(ch==')'||ch=='}'|| ch==']') {
			if(st.isEmpty()) {
				return false;
			}
			char top=st.pop();
			if((ch==')'&& top!='(')||
			   (ch=='}'&& top!='{')||
			   (ch==']'&& top!='[')) {
				return false;
			}
					
		}
	}
		
	return st.isEmpty();//balanced parenthesis
	}

}

