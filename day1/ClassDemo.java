package com.orgtav.day1;
public class ClassDemo {
	//instance variables
	public int year_of_joining;
	public String empname;
	//method
	public void disp()
	{
		String policy="Company policies";
		System.out.println("he follows-" + policy);
		System.out.println("employee name: " + empname + " he joined in:" + year_of_joining);
	}
    //constructor
	public ClassDemo(int year_of_joining, String empname) {
		super();
		this.year_of_joining = year_of_joining;
		this.empname = empname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo emp1=new ClassDemo(2022,"Rajendra");
		
		System.out.println("Hello Guys!!");	
		emp1.disp(); 
		
	}

}
