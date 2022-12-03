package com.pract.Strings;

import java.util.Scanner;

public class PanagramString {
	static int size = 26;
	
	
	
	
	static boolean isStringPanagram(String str) {
		String str1 = str.toLowerCase();
		
		boolean[] allchar=new  boolean[size];
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isLetter(str1.charAt(i))) {
				int letter = str1.charAt(i)-'a';
				allchar[letter]=true;
			}
		}
		
		
		for(int i=0;i<size;i++) {
			if(!allchar[i]) {
				return false;
				//break;
			}
		}
		
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the given String");
		String str = sc.next();
		
		System.out.println(isStringPanagram(str));
	}

}
