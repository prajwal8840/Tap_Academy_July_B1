package com.tapacademy.Examples;
import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printFactors(n);
    }

    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
