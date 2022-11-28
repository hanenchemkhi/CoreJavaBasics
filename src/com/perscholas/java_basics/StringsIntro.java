package com.perscholas.java_basics;

import java.io.*;
import java.util.*;

/**
 * Given two strings of lowercase English letters, A and B, perform the following operations:Sum the lengths of A and B.
 * Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?)
 * Capitalize the first letter in  A and B and print them on a single line, separated by a space.
 * 
 * @author Hanen Chemkhi
 *
 */


public class StringsIntro {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    String A = sc.next();
	    String B =sc.next();
	    /* Enter your code here. Print output to STDOUT. */
	        
	    System.out.println(A.length()+B.length());
	    System.out.println((A.compareTo(B)>0? "Yes":"No"));
	    String output = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
	    System.out.println(output);
	    sc.close();    
	    }
	}



