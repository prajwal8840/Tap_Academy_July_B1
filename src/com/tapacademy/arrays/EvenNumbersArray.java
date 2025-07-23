package com.tapacademy.arrays;

import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of elements
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        // Step 2: Read N space-separated integers into the array
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Print only the even numbers
        for (int i = 0; i < N; i++) {
            if (numbers[i] % 2 == 0) {  // Check if the number is even
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
