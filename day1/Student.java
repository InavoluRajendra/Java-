package com.orgtav.day1;

public class Student {
	String name;
	String standard;
	int marks;
	static String schoolname="dav";static String section="red";//class variable works on class level for memory management
	//1sttype
	public Student(String name,String standard,int marks)
	{
		System.out.println("first type cons call");
		this.name=name;
		this.standard=standard;
		this.marks=marks;
	}
	static void change()//static method
	{
		section="yellow";
	}
	void otput() {
		System.out.println("name -"+ name +" standard -"+ standard +" marks -" + marks+" section-"+schoolname+" section "+section);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("a", "1st", 10);
		Student.change();//static is called by class and not object
		Student s2=new Student("b", "2nd", 20);
		Student s3=new Student("c", "3rd", 30);
		Student s4=new Student("d", "4th", 40);
		Student s5=new Student("e", "5th", 50);
		
		s1.otput();
		s2.otput();
		s3.otput();
		s4.otput();
		s5.otput();
	}

}
