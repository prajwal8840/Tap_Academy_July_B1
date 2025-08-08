package com.tapacademy.arrays;

import java.util.Scanner;

public class StoreandPrintTemperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[] temperatures = new double[n];
		
		for(int i = 0 ; i < n ; i++) {
			temperatures[i] = sc.nextDouble();
		}
		
		for(int i = 0 ; i < n ;i++) {
			System.out.println("Temperatures of city " + (i+1) + " is: " + temperatures[i]);
		}
	}

}
