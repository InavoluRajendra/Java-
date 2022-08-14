package com.org.tav.day2;

public class multithread extends Thread {
	
	String task;
	public multithread(String task) {
		super();
		this.task = task;
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(task+" "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multithread t1=new multithread("cut the ticket");
		multithread t2=new multithread("show seat");
		Thread tt=new Thread(t1);
		Thread tt1=new Thread(t2);
		tt.start();
		tt1.start();

	}

}
