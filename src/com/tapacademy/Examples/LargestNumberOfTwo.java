package com.tapacademy.Examples;

import java.util.Scanner;

public class LargestNumberOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
