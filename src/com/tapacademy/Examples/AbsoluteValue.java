package com.tapacademy.Examples;
import java.util.Scanner;
public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n>=0) {
			System.out.println(n);
		}else {
			System.out.println(n * -1);
		}
	}

}
