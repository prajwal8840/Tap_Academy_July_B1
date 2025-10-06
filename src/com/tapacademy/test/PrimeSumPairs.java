package com.tapacademy.test;

import java.util.*;

public class PrimeSumPairs {

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to read the array from input
    static int[] readArray(Scanner scanner, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Method to find and print all prime sum pairs
    static void findPrimeSumPairs(int[] arr) {
        boolean found = false;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (isPrime(sum)) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }

    // LinkedList method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Read size of array
        int[] arr = readArray(scanner, n); // Read array

        findPrimeSumPairs(arr); // Process and print pairs
        
        scanner.close();
    }
}
