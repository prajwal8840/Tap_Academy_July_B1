package com.tapacademy.Examples;

import java.util.Scanner;

public class EndsWithZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n%10==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
