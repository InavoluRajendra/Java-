package com.org.tav.day2;

public class cpcons {
	int x=10;int y=20;
	public cpcons()
	{
		super();
	}
	cpcons(cpcons c)
	{
		x=c.x;
		y=c.y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cpcons c=new cpcons();
		System.out.println("val of x" + c.x);
		System.out.println("val of y" + c.y);
		c.x=23;
		c.y=21;
		System.out.println("update val");
		System.out.println("val of x" + c.x);
		System.out.println("val of y" + c.y);
		
		cpcons c1=new cpcons();
		System.out.println("not getting updated val of x and y in new obj");
		System.out.println("val of x" + c1.x);
		System.out.println("val of y" + c1.y);
		
		cpcons c2=new cpcons(c);
		System.out.println("getting updated val of x and y in new obj");
		System.out.println("val of x" + c2.x);
		System.out.println("val of y" + c2.y);
	}

}
