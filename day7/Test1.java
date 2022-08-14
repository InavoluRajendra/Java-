package com.org.tav.day7;

public interface Test1 {
	default void show()
	{
		System.out.println("test1 show");
	}
	static void print()
	{
		System.out.println("test1 static print");
	}
}



