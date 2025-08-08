package com.tapacademy.arrays;

import java.util.Scanner;

public class SortedArray {
	
	public static int findSortedArray(int[] arr) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] < arr[i -1]) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = findSortedArray(arr);
		System.out.println(result);
	}

}
