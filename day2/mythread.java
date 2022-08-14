package com.org.tav.day2;

public class mythread extends Thread {
	@Override
	public void run()
	{
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread running");
		mythread m=new mythread();
		Thread t=new Thread(m);
		t.start();

	}

}
