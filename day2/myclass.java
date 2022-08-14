package com.org.tav.day2;
//in method overriding method call is resolved by JVM based on runtime object(new Obj )
//method hiding method call is resolved by compiler based on reference type[obj reference]
class parent
{
	public static void m1()
	{
		System.out.println("class method in parent class");
	}
	void instancemethod()
	{
		System.out.println("instance method in parent class");
	}
}
class child extends parent
{
	public static void m1()
	{
		System.out.println("class method in child class");
	}
	void instancemethod()
	{
		System.out.println("instance method in child class");
	}
}

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p= new child();
		p.m1();//method hiding calling with reference as static
		p.instancemethod();//method overriding non static calling as obj
		child c=new child();
		c.m1();
		c.instancemethod();
		parent p1=new parent();
		p1.m1();
		p1.instancemethod();

	}

}
