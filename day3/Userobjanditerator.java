package com.org.tav.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class Userobjanditerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee e1=new Employee(1, "raju", "dot", 50000);
			Employee e2=new Employee(2, "rao", "dotnet", 30000);
			Employee e3=new Employee(3, "raj", "donut", 20000);
			ArrayList<Employee> a1=new ArrayList<Employee>();
			a1.add(e1);
			a1.add(e2);
			a1.add(e3);//reference
			Iterator<Employee> e=a1.iterator();
			while(e.hasNext()) {
				Employee ee=e.next();
				System.out.println(ee.empid+" "+ee.name+" "+ee.sal);
			}
			

	}

}
