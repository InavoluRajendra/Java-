package com.org.tav.day3;

public class UserInterface implements Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface u=new UserInterface();
		u.add();u.sub();u.multi();u.div();
		u.greet();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=12;
		int b=10;
		System.out.println("addition="+(a+b));
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=12;
		int b=10;
		System.out.println("addition="+(a-b));
		
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		int a=12;
		int b=10;
		System.out.println("addition="+(a*b));
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a=12;
		int b=10;
		System.out.println("addition="+(a/b));
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		
	}

}
