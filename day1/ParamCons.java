package com.orgtav.day1;

public class ParamCons {
	
	public ParamCons()
	{
		System.out.println("no arg cons");
	}
	public ParamCons(int a)
	{
		System.out.println("one arg cons");
	}
	public ParamCons(int a,int b)
	{
		System.out.println("two arg cons");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamCons p1=new ParamCons();
		p1=new ParamCons(1);
		p1=new ParamCons(2, 3);

	}

}
