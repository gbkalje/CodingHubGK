package com.pract.Strings;

public class EvenLengthWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Java Programming Language";
		
		String[] str1 = str.split(" ");
		
		for(int i=0;i<str1.length;i++) {
			//System.out.println("Given words:"+str1[i]);
			if(str1[i].length()%2==0) {
				System.out.println("Words with even length is:"+str1[i]);
			}
		}

	}

}
