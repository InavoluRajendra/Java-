package com.org.tav.day2;

import java.util.Scanner;

public class studentmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"harsh","shivesh","shivam"};
		int[][] marks=new int[3][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("enter marks of student"+i);
			for(int j=0;j<5;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<5;j++)
			{
				sum+=marks[i][j];
			}
			System.out.println("total mark of student"+i+" "+sum);
			double per=(sum*100)/500;
			System.out.println("percentage of student"+i+" "+per);
		}

	}

}
