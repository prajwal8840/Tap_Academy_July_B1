package com.tapacademy.Examples;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int fahrenheit = scan.nextInt();
		
		double celcius = (fahrenheit-32) * 5.0/9;
		
		System.out.printf("%.4f\n" , celcius );

	}

}
