package com.org.tav.day2;

public class chaining {

	public chaining() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("java dev by james");
	}
	public chaining(int year)
	{
		this("java",2121);
	}
	chaining(String name,int year)
	{
		this();
		System.out.println("in 2022");
	}
	void disp()
	{
		System.out.println("oops");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chaining c=new chaining(2022);
		c.disp();

	}

}
