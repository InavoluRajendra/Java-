package com.org.tav.day7;

import java.util.ArrayList;
interface Double{
	String dosomecode(String str);
}

//pass method as a parameter using lambda func
public class Lambdademo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=1;i<=5;i++)
		{
			a.add(i*10);
		}
		a.forEach((n)->{System.out.println(n);});
		
		Double d=(str)->str+"lambda";
		show("function",d);
	}
		public static void show(String s,Double d)
		{
			String greet=d.dosomecode(s);
			System.out.println(greet);
		}

	}


