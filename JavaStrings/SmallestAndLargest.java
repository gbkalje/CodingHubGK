package com.pract.Strings;

import java.util.Scanner;

public class SmallestAndLargest {

    public static String getSmallestAndLargest(String s, int k) {
        String min = "";
        String max = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        min = s.substring(0,k);
        max = s.substring(0,k);
        
        for(int i=1;i<=(s.length())-k;i++){
            String str = s.substring(i,i+k);
            
            if(str.compareTo(min)<0){
                min=str;
            }
            else if(str.compareTo(max)>0){
                max=str;
            }
        }
        
        return min + "\n" + max;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}