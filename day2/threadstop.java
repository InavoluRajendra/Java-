package com.org.tav.day2;
//why is stop method is deprecated in java and what is another way to kill the thread ?
//By using Boolean variable 
//By using isInterrupted() method 
public class threadstop extends Thread {
	static Thread t;
	public void run()
	{
		System.out.println("thread running");
		t.stop();
		System.out.println("carry on");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadstop s=new threadstop();
		t=new Thread(s);
		t.start();
		

	}

}
