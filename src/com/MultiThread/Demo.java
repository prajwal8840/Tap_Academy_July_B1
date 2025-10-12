package com.MultiThread;

import java.util.Scanner;

class Demo1 extends Thread{
	@Override
	public void run() {
		System.out.println("Addition started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition task completed");
	}
}

class Demo2 extends Thread{
	@Override
	public void run() {
		System.out.println("Character printing task started");
		for(int i = 65; i <= 69; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing task completed");
	}
	
}

class Demo3 extends Thread{
	@Override
	public void run() {
		System.out.println("Number printing task started");
		for(int i = 1; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing task completed");
	}
}




public class Demo {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
	
		
	}

}
