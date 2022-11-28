package com.perscholas.java_basics;
import java.io.*;
import java.util.*;
public class Palindrome {
	
	/**
	 * 
	 * Given a string s, print Yes if it is a palindrome, print No otherwise.
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for (int i = 0 ; i< A.length()/2; i++){
            if ((A.charAt(i))!=(A.charAt(A.length()-i-1))){
                System.out.println("No");
                sc.close();
                System.exit(0);
            }
        }
        System.out.println("Yes");
        sc.close();
    
	}

}
