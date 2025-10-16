package com.MultiThread.Runnable;


class Printer
{
	synchronized public void use()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		try
		{
			System.out.println(name + " started the Printing");
			Thread.sleep(5000);
			System.out.println(name + " is using Printing");
			Thread.sleep(5000);
			System.out.println(name + " completed Printing");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}


class Men extends Thread
{
	Printer pr;
	public Men(Printer pr)
	{
		this.pr=pr;
	}

	@Override
	public void run() 
	{
		pr.use();
	}
}


class Women extends Thread
{
	Printer pr;
	public Women(Printer pr)
	{
		this.pr=pr;
	}

	@Override
	public void run() 
	{
		pr.use();
	}
}

class Child extends Thread
{
	Printer pr;
	public Child(Printer pr)
	{
		this.pr=pr;
	}

	@Override
	public void run()
	{
		pr.use();
	}
}



public class Synchronize2 {

	public static void main(String[] args) {
		Printer pr = new Printer();

		Men m = new Men(pr);
		m.setName("MEN");
		Women w = new Women(pr);
		w.setName("WOMEN");
		Child c = new Child(pr);
		c.setName("CHILD");

		m.start();
		w.start();
		c.start();
	}

}
