package com.tapacademy.Subarrays;

import java.util.Scanner;

public class PrimeSubarray {
	
	public static boolean isPrime(int n) {
		
		if(n <= 1) return false;
		for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void printPrimeSubarray(int[] arr){
		int count = 0;
		
		for(int size = 1 ; size <= arr.length ; size++) {
			for(int i = 0 ; i <= arr.length - size ; i++) {
				int sum = 0;
				for(int j = i ; j < i + size ; j++) {
					sum += arr[j];
				}
				if(isPrime(sum)) {
					for(int j = i ; j < i + size ; j++) {
						System.out.print(arr[j] + " ");
						count++;
					}
					System.out.println();
				}
			}
		}
		if(count == 0) {
			System.out.println("None");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		printPrimeSubarray(arr);
	}

}
