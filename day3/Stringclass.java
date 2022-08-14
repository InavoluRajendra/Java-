package com.org.tav.day3;

public class Stringclass {
	public static void main(String args[])
	{
		String str="";
		int len=str.length();
		System.out.println("string length="+len);
		String str2="java is so powerful language";
		System.out.println("contains or not="+str2.contains("java"));
		int length=str2.length();
		System.out.println("length of str2="+length);
		char arr[]= {'j','a','v','a'};
		String s3=new String(arr);
		System.out.println("arr="+s3.length());
		str2=str2.replace('a', 'e');
		System.out.println(str2);
	}

}
