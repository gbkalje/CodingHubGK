package com.pract.Strings;

import java.util.Scanner;

public class ReverseString {
	
	private static String reverseString(String str) {
		
		String nstr="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			nstr=ch+nstr;
		}
		
		return nstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the given String:");
		String str = sc.nextLine();
		
		System.out.println(reverseString(str));
		

	}

}
