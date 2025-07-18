package com.tapacademy.Examples;
import java.util.Scanner;
public class AsciiUppercaseCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n>=65 && n<=95) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
