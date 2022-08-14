package com.orgtav.day1;

public class ConstructorDemo {
	
	//default
	//Parameterized
	String name;int age;String address;
	
	void show() {
		System.out.println("name -"+ name +" age -"+ age +" address -" + address);
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c1=new ConstructorDemo();//default constructor
		
		c1.show();
				
	}

}
