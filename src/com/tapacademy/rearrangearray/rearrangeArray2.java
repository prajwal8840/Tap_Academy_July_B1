package com.tapacademy.rearrangearray;

import java.util.*;

public class rearrangeArray2 {

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int index = 0;

        // Step 1: Shift all non -1 elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill the rest with -1
        while (index < n) {
            arr[index++] = -1;
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


//Rearrange Array with -1 at the End

//Sample Input 1

//7
//3 5 -1 2 8 -1 7
//Sample Output 1
//
//3 5 2 8 7 -1 -1
