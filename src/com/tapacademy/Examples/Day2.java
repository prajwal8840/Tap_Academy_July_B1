package com.tapacademy.Examples;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n%2 == 0)
		{
			System.out.println("Yes");
		} else 
		{
			System.out.println("No");
		}

	}

}
