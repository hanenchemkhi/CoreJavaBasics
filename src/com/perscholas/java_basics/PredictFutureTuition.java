package com.perscholas.java_basics;

public class PredictFutureTuition {

	public static void main(String[] args) {
		Double tuition = 10000.0;
		int countYear = 0;
		while (tuition<=20000.0) {
			tuition = 1.07*tuition;
			countYear ++;
		}
		System.out.println("In " +countYear + " years the tuition will be doubled");

	}

}
