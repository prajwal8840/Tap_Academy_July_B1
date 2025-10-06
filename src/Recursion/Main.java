package Recursion;

import java.util.Scanner;

public class Main {

	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
	
	
	
	
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	
	//Natural numbers...
	public static void printN(int n) {
		if(n == 0) {
			return;
		}
		printN(n-1);	// printN(n) = printN(n - 1)
		System.out.println(n);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int countDigits(int n) {
		if(n == 0) {
			return 0;
		}
		return countDigits(n / 10) + 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int sumOfDigits(int n) {
		if(n == 0) {
			return 0;
		}
		return sumOfDigits(n / 10) + (n % 10);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int n = 5;
		//System.out.println(factorial(n));
		//System.out.println(fibonacci(7));
		//printN(5);
		//System.out.println(countDigits(123456));
		System.out.println(sumOfDigits(n));
	}

}
