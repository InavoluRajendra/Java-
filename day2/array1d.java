package com.org.tav.day2;

import java.util.Arrays;
import java.util.Scanner;

public class array1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("max number in array");
		System.out.println(a[(a.length)-1]);

	}

}
