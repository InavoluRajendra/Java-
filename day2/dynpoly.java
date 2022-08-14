package com.org.tav.day2;
//method overriding at runtime same name of method diff signature
class base
{
	void m1()
	{
		System.out.println("m1 base class");
	}
}
class der extends base
{
	void m1()
	{
		System.out.println("m1 derived class");
	}
}

public class dynpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		der d=new der();
		d.m1();
		base b= new base();
		b.m1();

	}

}
