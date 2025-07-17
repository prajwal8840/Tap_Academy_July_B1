package com.tapacademy.Examples;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int width = scan.nextInt();
		
		int perimeter = 2 * (length + width);
		
		System.out.println(perimeter);
	}

}
