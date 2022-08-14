package com.org.tav.day7;

public class ImplemT1T2 implements Test1,Test2{
	static void print()
	{
		System.out.println("class static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplemT1T2 i=new ImplemT1T2();
		ImplemT1T2.print();
		Test1.print();
		i.show();
		
		Calculation<Integer> add=(x,y)->x+y;
		Integer res=add.compute(10, 5);
		System.out.println("result"+res);
		}
	
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Test1.super.show();
		Test2.super.show();
	}

}
