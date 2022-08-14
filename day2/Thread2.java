package com.org.tav.day2;

public class Thread2 implements Runnable{

	public static void main(String[] args) {
		System.out.println("main thread running");
		// TODO Auto-generated method stub
		Thread2 t=new Thread2();
		Thread tt=new Thread(t);
		tt.start();

	}
	@Override
	public void run()
	{
		System.out.println("new thread running");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread());
	}

}
