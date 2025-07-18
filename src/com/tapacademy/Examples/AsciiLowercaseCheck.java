package com.tapacademy.Examples;

import java.util.Scanner;

public class AsciiLowercaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n>=97 && n<=122) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}