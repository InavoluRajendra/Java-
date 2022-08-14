package com.orgtav.day1;

class Student1
{
	static String name(String n)
	{
		return n;
	}
	static int rollno(int r)
	{
		return r;
	}
	static int std(int s)
	{
		return s;
	}
}
public class Studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=Student1.name("raj");
		int rollno=Student1.rollno(20);
		int std=Student1.std(35);
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(std);
	}

}
