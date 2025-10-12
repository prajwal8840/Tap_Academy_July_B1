package com.MultiThread.Runnable;

class BathRoom
{
	synchronized public void use()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		try
		{
			System.out.println(name + " has entered the BathRoom");
			Thread.sleep(5000);
			System.out.println(name + " is using BathRoom");
			Thread.sleep(5000);
			System.out.println(name +" has exited from BathRoom");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}


class Boy extends Thread
{
	BathRoom ba;
	public Boy(BathRoom ba)
	{
		this.ba=ba;
	}

	@Override
	public void run() 
	{
		ba.use();
	}
}


class Girl extends Thread
{
	BathRoom ba;
	public Girl(BathRoom ba)
	{
		this.ba=ba;
	}

	@Override
	public void run() 
	{
		ba.use();
	}
}

class Others extends Thread
{
	BathRoom ba;
	public Others(BathRoom ba)
	{
		this.ba=ba;
	}

	@Override
	public void run()
	{
		ba.use();
	}
}



public class Day47 {

	public static void main(String[] args) {
		BathRoom ba = new BathRoom();

		Boy b = new Boy(ba);
		b.setName("BOY");
		Girl g = new Girl(ba);
		g.setName("GIRL");
		Others o = new Others(ba);
		o.setName("OTHERS");

		b.start();
		g.start();
		o.start();
	}

}
