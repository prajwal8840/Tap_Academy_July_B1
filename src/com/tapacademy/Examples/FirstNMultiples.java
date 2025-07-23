package com.tapacademy.Examples;

import java.util.Scanner;

public class FirstNMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input value N
        int n = scanner.nextInt();
        int count = 0;
        int i = 1;

        // Keep printing numbers that are multiples of 3, 5, or 7
        while (count < n) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

        scanner.close();
    }
}
