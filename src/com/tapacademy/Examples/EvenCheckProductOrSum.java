package com.tapacademy.Examples;

import java.util.Scanner;

public class EvenCheckProductOrSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  // First integer input
        int m = scanner.nextInt();  // Second integer input

        if (n % 2 == 0 && m % 2 == 0) {
            // Both numbers are even
            System.out.println(n * m);
        } else {
            // At least one number is odd
            System.out.println(n + m);
        }
    }
}



		//Multiplication or Addition