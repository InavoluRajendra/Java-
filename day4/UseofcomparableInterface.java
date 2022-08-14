package com.org.tav.day4;

import java.util.Arrays;
import java.util.Collections;

//comparable interface used to compare two objects of same class.mainly used for natural sorting
//this interface can be implemented by any custom class or user-defined if to use array or collection sorting methods
//comparable interface method=> compareto() in a way<,>+
//it provide single sorting sequence i.e you can sort the element on the basis of single data member only .
//declaration => public interface Comparable<T>
//compartTo() => + int (if current obj is greater then the specified obj =>this>Object) , -ve int(this<Object> , 0 (this= Object)
public class UseofcomparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st[]=new Student[3];
		st[0]=new Student(102, "carl", 18);
		st[1]=new Student(105, "tony", 10);
		st[2]=new Student(101, "henry", 12);
		
		Arrays.sort(st);
		for(Student s:st)
			System.out.println("name "+s.name+" age "+s.age+" roll "+s.rollno);
		
		Employee e[]=new Employee[3];
		e[0]=new Employee("raju", 21000);
		e[1]=new Employee("dhan", 31200);
		e[2]=new Employee("shiv", 25000);
		Arrays.sort(e);
		for(Employee e1:e)
			System.out.println("name "+e1.getName()+" salary"+e1.getSalary());
	}

}
