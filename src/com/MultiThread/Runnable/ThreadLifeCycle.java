package com.MultiThread.Runnable;

class Warrior extends Thread
{
	String res1 = "Brahmastra";
	String res2 = "Sarpastra";
	String res3 = "Pashupatstra";
	@Override
	public void run()
	{
		String name = getName();
		if(name.equals("Arjuna"))
		{
			arjuna();
		}
		else
		{
			Karna();
		}
	}
	
	public void arjuna()
	{
		try
		{
			Thread.sleep(5000);
			synchronized (res1) 
			{
				System.out.println("Arjuna acquired " + res1);
				Thread.sleep(5000);
				synchronized (res2) 
				{
					System.out.println("Arjuna acquired " + res2);
					Thread.sleep(5000);
					synchronized (res3) 
					{
						System.out.println("Arjuna acquired " + res3);
					}
				}
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public void Karna()
	{
		try
		{
			Thread.sleep(5000);
			synchronized (res1) 
			{
				System.out.println("Karna acquired " + res1);
				Thread.sleep(5000);
				synchronized (res2) 
				{
					System.out.println("Karna acquired " + res2);
					Thread.sleep(5000);
					synchronized (res3) 
					{
						System.out.println("Karna acquired " + res3);
					}
				}
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}





public class ThreadLifeCycle {

	public static void main(String[] args)
	{
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		
		w1.setName("Arjuna");
		w2.setName("Karna");
		
		w1.start();
		w2.start();
	}

}




















