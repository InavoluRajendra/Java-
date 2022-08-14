package com.org.tav.day2;

class emp
{
	String name;
	int roll;
	public emp(String name,int roll)
	{
		super();
		this.name=name;
		this.roll=roll;
	}
}
public class arrayofobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e[]=new emp[3];
		e[0]=new emp("a",1);
		e[1]=new emp("b",2);
		e[2]=new emp("c",3);
		 for(int i=0;i<e.length;i++)
		 {
			 System.out.println("name ="+e[i].name+" "+"rollno="+e[i].roll);
		 }

	}

}
