package com.MultiThread.Runnable;

class Captain extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			BattingCoach ba = new BattingCoach();
			BowlingCoach bo = new BowlingCoach();
			ba.setName("BAT");
			bo.setName("BOWL");
			
			ba.setDaemon(true);
			bo.setDaemon(true);
			ba.start();
			bo.start();
			
			System.out.println("Captain has entered the ground");
			sleep(5000);
			System.out.println("Captain will do warm-up");
			sleep(5000);
			System.out.println("Captain will do fielding practise");
			sleep(5000);
			System.out.println("Captain will do batting practise");
			sleep(5000);
			System.out.println("Captain will do bowling practise");
			sleep(5000);
			System.out.println("Captain will go hotel");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}


class BattingCoach extends Thread
{
	@Override
	public void run() 
	{
		for( ; ; )
		{
			System.out.println("BattingCoach is in the ground");
			try
			{
				sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}


class BowlingCoach extends Thread
{
	@Override
	public void run() 
	{
		for( ; ; )
		{
			System.out.println("BowlingCoach is in the ground");
			try
			{
				sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}





public class Daemon {

	public static void main(String[] args) 
	{
		Captain c = new Captain();
		
		c.setName("CAP");
		
		c.start();
		
	}

}
