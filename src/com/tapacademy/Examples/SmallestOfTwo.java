package com.tapacademy.Examples;

import java.util.Scanner;

public class SmallestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three space-separated integers
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int smallest = (n < m ? n : m);
        
        System.out.println(smallest);
        
	}

}
