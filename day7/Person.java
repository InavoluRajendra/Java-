package com.org.tav.day7;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person {
	
	public enum Sex{
		male,female;
	}
	String name;
	LocalDate birthday;
	public String getName() {
		return name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public Sex getGender() {
		return gender;
	}
	String emailAddress;
	Sex gender;
	public int getage() {
		return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
	}
	public void printperson()
	{
		System.out.println(name+" , "+ this.getage());
	}
	public Person(String name, LocalDate birthday, String emailAddress, Sex gender) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.emailAddress = emailAddress;
		this.gender = gender;
	}
	public static List<Person> createRoster(){
		ArrayList<Person> roster=new ArrayList<Person>();
		roster.add(new Person("fara", IsoChronology.INSTANCE.date(1980,6,20), "abc@gmail.com", Person.Sex.male));
		roster.add(new Person("fara", IsoChronology.INSTANCE.date(1981,2,20), "ab@gmail.com", Person.Sex.female));
		roster.add(new Person("fara", IsoChronology.INSTANCE.date(1982,3,20), "bc@gmail.com", Person.Sex.male));
		roster.add(new Person("fara", IsoChronology.INSTANCE.date(1983,5,20), "abcd@gmail.com", Person.Sex.female));
		return roster;
	}
	//approach 1
	public static void printPerson(List<Person> roster , int age) {
	    for(Person p :roster) {if(p.getage() >= age) {
	        p.printperson();}
	    }
	}
	
}
