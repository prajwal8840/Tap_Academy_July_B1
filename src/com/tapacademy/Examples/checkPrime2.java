package com.tapacademy.Examples;

import java.util.Scanner;

public class checkPrime2 {
	
	public static String checkPrime(int n) {
		if(n<2) {
			return "Not Prime";
		}
		
		for(int i = 2 ; i <= n/2 ; i++) {
			if(n % i == 0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String result = checkPrime(n);
		System.out.println(result);
	}

}
