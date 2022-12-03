package com.pract.Strings;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "01000023569";
		String str1="";
		
		
		char[] sarr = str.toCharArray();
		
		int j=0;
		for(int i=0;i<sarr.length;i++) {
			if(sarr[j]=='0') {
				j++;
			}
			else {
				str1 = str1 + sarr[i];
			}
		}
		
		System.out.println("Given String is:"+str1);
		
		

	}

}
