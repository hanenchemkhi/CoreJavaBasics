package com.perscholas.java_basics;

import java.io.*;
import java.util.*;
/**
 * Given a string, s , matching the regular expression [A-Za-z !,?._'@]+, 
 *split the string into tokens.
 *We define a token to be one or more consecutive English alphabetic letters.
 * Then, print the number of tokens, followed by each token on a new line.
 * 
 * @author Hanen Chemkhi
 *
 */

public class StringTokens {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        String[] tokens = s.split("[,'!_ ?.@]+");
	        System.out.println(tokens.length);        
	  
	        for (String token : tokens)
	            System.out.println(token);
	        
	        scan.close();
	    }

}
