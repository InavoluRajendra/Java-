package com.org.tav.day3;

public class Stringbuilderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("i love java");
		int len=sb.length();
		System.out.println("length="+len);
		
		int capacity=sb.capacity();//(current capacity*2)+2
		System.out.println("capacity="+capacity);
		sb.ensureCapacity(20);
		System.out.println("new capacity"+sb.capacity());
	}

}
