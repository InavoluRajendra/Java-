package com.org.tav.day7;
@FunctionalInterface
public interface DemoFunctional {
	//public void sum();
	public void print();
	//public void datacell();
	default void move()
	{
		System.out.println("default method");
	}
	static void hi()
	{
		System.out.println("new static method");
	}
}//static and default methods can have body in interface
