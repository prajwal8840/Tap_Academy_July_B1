package com.tapacademy.Examples;

import java.util.Scanner;

public class CheckPrime {
	
	public static void checkPrime(int n) {
		int count = 0;
		for(int i = 1 ; i <= n ; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkPrime(n);
	}

}
