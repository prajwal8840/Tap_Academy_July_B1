package com.tapacademy.arrays;

import java.util.Scanner;

public class StudentNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of students
        int n = Integer.parseInt(scanner.nextLine());

        // Create array to store names
        String[] names = new String[n];

        // Read names
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Print names
        for (int i = 0; i < n; i++) {
            System.out.println("Student at index " + i + " is: " + names[i]);
        }

        scanner.close();
    }
}
