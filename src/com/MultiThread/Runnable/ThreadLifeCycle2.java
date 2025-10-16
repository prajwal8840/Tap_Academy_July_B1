package com.MultiThread.Runnable;

class ResourceLock extends Thread {
	String res1 = "Sword";
	String res2 = "Shield";
	String res3 = "Armor";

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		try {
			Thread.sleep(4000);
			synchronized (res1) {
				System.out.println(name + " acquired " + res1);
				Thread.sleep(4000);

				synchronized (res2) {
					System.out.println(name + " acquired " + res2);
					Thread.sleep(4000);

					synchronized (res3) {
						Thread.sleep(4000);
						System.out.println(name + " has all weapons ready!\n");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadLifeCycle2 {
	public static void main(String[] args) {
		ResourceLock r1 = new ResourceLock();
		ResourceLock r2 = new ResourceLock();

		r1.setName("Knight");
		r2.setName("Samurai");

		r1.start();
		r2.start();
	}
}
