package com.tapacademy.Examples;

import java.util.Scanner;

public class NumberASCIICheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=48 && n<=57) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}