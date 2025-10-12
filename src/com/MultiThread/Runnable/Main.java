package com.MultiThread.Runnable;

import java.util.Scanner;

class SingleRun implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if(name.equals("ADD") == true) {
			add();
		}else if(name.equals("charPrint") == true) {
			charPrint();
		}
		else {
			numPrint();
		}
	}
	
	public void add() {
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
	
	public void charPrint() {
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
	
	public void numPrint() {
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



public class Main {

	public static void main(String[] args) {
		SingleRun sr = new SingleRun();
		
		Thread t1 = new Thread(sr);
		Thread t2 = new Thread(sr);
		Thread t3 = new Thread(sr);
		
		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
