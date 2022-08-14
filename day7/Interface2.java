package com.org.tav.day7;

public interface Interface2 {
	public void m2();
	
	default void move()
	{
		System.out.println("default method i2");
	}
	static void hello()
	{
		System.out.println("static from interface2");
	}

}
