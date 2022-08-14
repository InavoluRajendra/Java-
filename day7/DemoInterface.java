package com.org.tav.day7;

import java.util.ArrayList;

public class DemoInterface implements DemoFunctional,Interface2{
	
	static void hello() {
		System.out.println("called from class..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<DemoInterface> a=new ArrayList<>();
		a.add(new DemoInterface());
		a.add(new DemoInterface());
		a.add(new DemoInterface());
		a.forEach((DemoFunctional d)->d.move());
		
		DemoInterface d1=new DemoInterface();
		d1.print();
		d1.move();
		DemoFunctional.hi();
		Interface2.hello();
		DemoInterface.hello();

	}
	public void print()
	{
		System.out.println("override method of java8");
	}
	public void move()
	{
		DemoFunctional.super.move();;
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("interface2 method");
	}

}
