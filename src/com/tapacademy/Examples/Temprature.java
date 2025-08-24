package com.tapacademy.Examples;
import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		// celsius to fahrenheit 
		// Formula (0°C × 9/5) + 32 
		
		float f = (c * 9.0f/5) + 32;
		
		System.out.println(f);

	}

}
