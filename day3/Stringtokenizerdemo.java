package com.org.tav.day3;

import java.util.StringTokenizer;

public class Stringtokenizerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer ss=new StringTokenizer("Java String tokenizer");
		while(ss.hasMoreTokens())
		{
			System.out.println(ss.nextToken());
		}
	}

}
