package com.perscholas.java_basics;

import java.util.ArrayList;

public class JavaBasicsClass {
	
	public static void binaryNotation (int x) {
		int number = x;
		ArrayList<Integer> notation = new ArrayList<Integer>();
		
		while (number > 0){
			notation.add(number%2)  ;
			number = number/2;
		}
		
		for (int i = notation.size()-1; i >=0; i--) {
            System.out.print(notation.get(i));
		}
		System.out.println();
		return;
	}
	


	public static void main(String[] args) {
		binaryNotation(5);
		
		binaryNotation(3512);
		
		
	}

}
