package com.tapacademy.rearrangearray;

import java.util.Scanner;

public class rearrangeArray1 {
	public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // Step 1: Collect non-negative (>=0) numbers first
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Step 2: Collect negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
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


//Rearrange Array with Positive Integers at the Beginning and Negative Integers at the End

//Sample Input 1
//
//6
//-3 5 -1 2 -8 -7
//Sample Output 1
//
//5 2 -3 -1 -8 -7

		






