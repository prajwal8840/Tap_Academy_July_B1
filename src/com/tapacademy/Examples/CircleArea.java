package com.tapacademy.Examples;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		
		double pi = 3.142;
		
		double area = pi * radius * radius ;
		
		//System.out.println(area); 
	
		//NOTE: 4 decimal points has to printed.
		
		System.out.printf("%.4f" , area);

	}

}
