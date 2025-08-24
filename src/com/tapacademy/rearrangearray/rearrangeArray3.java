package com.tapacademy.rearrangearray;

import java.util.Scanner;

public class rearrangeArray3 {
	
	public static void rearrangeArray(int[] arr , int n) {
		 int[] temp = new int[n];
	        int k = 0;

	        // Step 1: copy all negative numbers
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < 0) {
	                temp[k++] = arr[i];
	            }
	        }

	        // Step 2: copy all non-negative numbers
	        for (int i = 0; i < n; i++) {
	            if (arr[i] >= 0) {
	                temp[k++] = arr[i];
	            }
	        }

	        // Step 3: copy back to original array
	        for (int i = 0; i < n; i++) {
	            arr[i] = temp[i];
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        rearrangeArray(arr, n);

	        for (int x : arr) {
	            System.out.print(x + " ");
	        }
	    }
	}


//Rearrange Array with Negative Integers at the Beginning and Positive Integers at the End


		//Sample Input 1
		//
		//6
		//-3 5 -1 2 -8 -7
		//Sample Output 1
		//
		//-3 -1 -8 -7 5 2






