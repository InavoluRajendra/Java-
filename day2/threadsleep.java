package com.org.tav.day2;

public class threadsleep implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 threadsleep s = new threadsleep();
	       Thread t1 = new Thread(s, "First Child Thread");

	       threadsleep s1 = new threadsleep();
	       Thread t2 = new Thread(s1, "Second Child Thread");

	       t1.start(); t2.start();

	}
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			System.out.println("current Thread "+Thread.currentThread());
		}
	}

}
