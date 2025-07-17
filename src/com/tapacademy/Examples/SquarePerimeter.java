package com.tapacademy.Examples;

import java.util.Scanner;

public class SquarePerimeter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int area = scanner.nextInt();
		
		int Perimeter = 4 * area ;
		
		System.out.println(Perimeter);
	}

}
