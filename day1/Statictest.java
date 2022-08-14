package com.orgtav.day1;

public class Statictest {
	static int x=10;
	int y=20;
	//static runs before main while class is loading ,main is loaded after class is loaded
	static
	{
		System.out.println("running without main");
	}
	void display()
	{
		System.out.println("non static method");
		System.out.println(x);
		System.out.println(y);
	}
	static void show()
	{
		System.out.println("static method");
		System.out.println(x);
		//System.out.println(y); non static cannot be accessed
		
	}
	public static void main(String args[])
	{
		Statictest s1=new Statictest();
		s1.display();
		show();//or class.show()
	}
}
