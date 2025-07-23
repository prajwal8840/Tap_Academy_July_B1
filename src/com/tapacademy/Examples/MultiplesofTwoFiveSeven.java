package com.tapacademy.Examples;

import java.util.Scanner;

public class MultiplesofTwoFiveSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		for(int i = 2; i <= n ; i++) {
			if(i % 2 == 0 || i % 5 == 0 || i % 7 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
