package com.org.tav.day2;

class x implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread x starting");
		for(int i=1;i<=4;i++)
		{
			System.out.println("thread x="+i);
		}
		System.out.println("exit from thread x");
	}
	
}
class y implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread y starting");
		for(int i=1;i<=4;i++)
		{
			System.out.println("thread y="+i);
		}
		System.out.println("exit from thread y");
		
	}
	
}
class z implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread z starting");
		for(int i=1;i<=4;i++)
		{
			System.out.println("thread z="+i);
		}
		System.out.println("exit from thread z");
	}
	
}

public class threadpi extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x x1=new x();
		y y1=new y();
		z z1=new z();
		Thread t1=new Thread(x1);
		Thread t2=new Thread(y1);
		Thread t3=new Thread(z1);
		//setpriority
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t2.getPriority()+4);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
