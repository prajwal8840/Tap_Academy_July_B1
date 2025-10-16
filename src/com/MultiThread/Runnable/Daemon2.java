package com.MultiThread.Runnable;

class Hero extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			CameraMan cm = new CameraMan();
			Editor ed = new Editor();
			cm.setName("CAMERAMAN");
			ed.setName("EDITOR");
			
			cm.setDaemon(true);
			ed.setDaemon(true);
			cm.start();
			ed.start();
			
			System.out.println("Hero has entered the set");
			sleep(5000);
			System.out.println("Hero will do fight-scean");
			sleep(5000);
			System.out.println("Hero will do some stunt scene");
			sleep(5000);
			System.out.println("Hero will go home");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class CameraMan extends Thread
{
	@Override
	public void run()
	{
		for( ; ; )
		{
			System.out.println("CameraMan will shoot the all Sceans");
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

class Editor extends Thread
{
	@Override
	public void run() 
	{
		for( ; ; )
		{
			System.out.println("Editor will edit all the Sceans");
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



public class Daemon2 {

	public static void main(String[] args) 
	{
		Hero h = new Hero();
		
		h.setName("HERO");
		
		h.start();
		
	}
}
