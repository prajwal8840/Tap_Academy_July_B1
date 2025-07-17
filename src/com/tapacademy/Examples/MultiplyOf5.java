package com.tapacademy.Examples;

import java.util.Scanner;

public class MultiplyOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n% 5 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
