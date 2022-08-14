package com.org.tav.day3;

public class str {
		//== compares addresses
	//equals compares characters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d="raju";
		String e="raju";
		
		String f=new String("hai");
		String g=new String("raju");
		String h="GOOD MORNING";
		String i=new String("good morning");
		System.out.println(h.equals(i));
		System.out.println(h.equalsIgnoreCase(i));
		
		System.out.println(d.equals(f));
		System.out.println(d.equals(e));
		System.out.println(d.equals(args));
		System.out.println(d.equals(null));
		
		if(e.equals(g))
		{
			System.out.println("both r equal");
		}
		else
		{
			System.out.println("both are unequal");
		}

	}

}
