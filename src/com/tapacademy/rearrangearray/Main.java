package com.tapacademy.rearrangearray;

import java.util.Scanner;

public class Main {
	
	public static void rearrangeArray(int[] arr) {
		int i = arr.length - 1 , j = arr.length - 1;
		
		while(i >= 0) {
			if(arr[i] == -1) {
				i--;
			}else {
				arr[j] = arr[i];
				j--;
				i--;
			}
		}
		while(j >= 0) {
			arr[j] = -1;
			j--;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		rearrangeArray(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

		

//		Sample Input 1
		
//		7
//		3 5 -1 2 8 -1 7
//		Sample Output 1
		
//		-1 -1 3 5 2 8 7




