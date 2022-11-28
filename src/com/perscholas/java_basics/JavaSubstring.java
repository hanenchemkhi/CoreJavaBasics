package com.perscholas.java_basics;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given a string, print a substring for a range of indices.
 * @author Hanen Chemkhi
 *
 */
public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
        in.close();
    }
}

