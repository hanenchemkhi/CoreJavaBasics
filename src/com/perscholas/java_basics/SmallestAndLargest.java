package com.perscholas.java_basics;
import java.util.Scanner;

/**
 * Given a string, s, and an integer, k , 
 * complete the function so that it finds the lexicographically smallest and largest substrings of length k.
 * 
 * 
 */


public class SmallestAndLargest {
	public static void main(String[] args) {
		String s= "welcometojava";
		System.out.println(getSmallestAndLargest(s,3));
	}

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String sub = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        
        for(int i = 1; i<=s.length()-k; i++){
            sub = s.substring(i, i+k);
            if (sub.compareTo(smallest)<0){
                smallest = sub;
            }
            if (sub.compareTo(largest)>0){
                largest = sub;
            }
            
        }
        
        return smallest + "\n" + largest;
    }

}