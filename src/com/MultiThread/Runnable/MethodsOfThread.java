package com.MultiThread.Runnable;

class Alpha extends Thread{
	@Override
	public void run() {

		//Join method

		try {
			System.out.println(getName() + " started to execute ");
			sleep(3000);
			System.out.println(getName() + " is executing");
			sleep(3000);
			System.out.println(getName() + " is executing");
			sleep(3000);
			System.out.println(getName() + " is executing");
			sleep(3000);
			System.out.println(getName() + " completed the execution");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



class Beta extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(getName() + " started to execute ");
			sleep(3000);
			System.out.println(getName() + " is executing");
			sleep(3000);
			System.out.println(getName() + " is executing");
			sleep(3000);
			System.out.println(getName() + " is executing");
			sleep(3000);
			System.out.println(getName() + " completed the execution");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


public class MethodsOfThread {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Main thread started to execute");
		Alpha a = new Alpha();
		Beta b = new Beta();
		a.start();
		a.join();
		System.out.println(a.isAlive());
		b.start();
		b.join();
		System.out.println("Main thread completed the execution");
	}

}
