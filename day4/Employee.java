package com.org.tav.day4;

public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(salary==o.salary)
			return 0;
		else if(salary>o.salary)
			return 1;
		else 
			return -1;
	}
	public void hikesalary(double byper)
	{
		double hike=salary*byper/100 ;
		salary+=hike;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
