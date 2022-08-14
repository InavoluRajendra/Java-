package com.org.tav.day2;

class a implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread start");
		for(int i=0;i<=3;i++)
		{
			System.out.println("I="+i);
		}
		System.out.println("childthread 1 is running");
	}
	
}
class b implements Runnable
{
	public void run() {
		System.out.println("Child Thread 2 start running ...");
        for(int j = 1 ; j<=3;j++) {
            System.out.println("J :"+j);
        }
        System.out.println("Child Thread 2 is ending ");
		
	}
}
public class joindemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		a a1=new a();
		b b1=new b();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("main thread is ending");

	}

}
