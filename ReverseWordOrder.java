package com.jsp.StringPrograms;

public class ReverseWordOrder {
	public static void reverseWords(String str) {
		String s[]=str.split(" ");
		for(int i = s.length-1; i>=0; i--) {
			System.out.print(s[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		String str = "Hello Good Morning";
		reverseWords(str);
	}

	
}
