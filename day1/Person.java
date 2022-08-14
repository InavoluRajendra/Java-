package com.orgtav.day1;

public class Person {
	
	//ivar
	String name;int age;String address;
	//declare default cons
	Person()
	{
		name="raj";
		age=22;
		address="guntur";
	}
	void show() {
		System.out.println("name -"+ name +" age -"+ age +" address -" + address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.show();

	}

}
