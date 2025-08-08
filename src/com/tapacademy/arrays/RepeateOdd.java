package com.tapacademy.arrays;

import java.util.Scanner;

public class RepeateOdd {
		
	
	public static void printCommonOddElements(int[] arr1 ,int[] arr2) {
		
		boolean found = false ;
		
		for(int i = 0 ; i < arr1.length ; i++) {
			if(arr1[i] % 2 != 0) {
				for(int j = 0 ; j < arr2.length ; j++) {
					if (arr1[i] == arr2[j]) {
						System.out.print(arr1[i] + " ");
						found = true;
						break;
					}
				}
			}
		}
		
		if(!found) {
			System.out.println("No common odd elements found. ");
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		
		for(int i = 0 ; i < n ;i++) {
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		
		for(int i = 0 ; i < m ;i++) {
			arr2[i] = sc.nextInt();
		}
		
		printCommonOddElements(arr1 , arr2);
	}

}






		
//		Sample Input 1
//		
//		5
//		1 2 3 4 5
//		5
//		3 4 5 6 7
//		Sample Output 1
//		
//		3 5
//		Sample Input 2
//		
//		4
//		2 4 6 8
//		4
//		1 3 5 7
//		Sample Output 2
//		
//		No common odd elements found.