package com.org.tav.day2;

public class threadyield extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadyield t=new threadyield();
		Thread t1=new Thread(t);
		
		threadyield t2=new threadyield();
		Thread t3=new Thread(t2);
		t1.setPriority(3);
		t3.setPriority(8);
		t1.start();
		t3.start();

	}
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

}
