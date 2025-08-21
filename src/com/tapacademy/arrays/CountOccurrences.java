package com.tapacademy.arrays;

import java.util.*;

public class CountOccurrences {

    // Method to count and print occurrences
    public static void countOccurrences(int[] arr) {
        int n = arr.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " " + count);
                count = 1;
            }
        }

        // Print the last element's count
        System.out.println(arr[n - 1] + " " + count);
    }

    // Method to read array from input
    static int[] readArray(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
        int n = sc.nextInt();

        // Read array
        int[] arr = readArray(sc, n);

        // Count and print occurrences
        countOccurrences(arr);

        sc.close();
    }
}
