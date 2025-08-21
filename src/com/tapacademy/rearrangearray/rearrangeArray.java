package com.tapacademy.rearrangearray;

import java.util.Scanner;

public class rearrangeArray {

	public static void rearrangeArray(int[] arr) {
		int i = arr.length - 1, j = arr.length - 1;
		
		while(i >= 0) {
			if(arr[i] == 0) {
				i--;
			}else {
				arr[j] = arr[i];
					j--;
					i--;
				}
			}
			while(j >= 0) {
				arr[j] = 0;
				j--;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		rearrangeArray(arr);
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	}	
			
			
			
			
			
			
		