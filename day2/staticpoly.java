package com.org.tav.day2;

public class staticpoly {
	void sum(int x,int y)//method overloading
	{
		int s=x+y;
		System.out.println("sum is"+ s);
	}
	void sum(int x,int y,int z)
	{
		int s=x+y+z;
		System.out.println("sum of 3 is"+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticpoly s=new staticpoly();
		s.sum(2, 3);
		s.sum(1, 20, 30);

	}

}
