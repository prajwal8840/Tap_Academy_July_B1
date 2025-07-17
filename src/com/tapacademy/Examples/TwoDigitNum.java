package com.tapacademy.Examples;
import java.util.Scanner;
public class TwoDigitNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();

		        if ((n >= 10 && n <= 99) || (n <= -10 && n >= -99)) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		    }
		}
	

	
	
