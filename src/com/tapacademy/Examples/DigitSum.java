package com.tapacademy.Examples;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int num = scanner.nextInt();
        int sum = 0;

        // Loop to extract and sum each digit
        while (num > 0) {
            sum += num % 10;  // Add last digit
            num = num / 10;   // Remove last digit
        }

        // Output the result
        System.out.println(sum);

        scanner.close();
    }
}
