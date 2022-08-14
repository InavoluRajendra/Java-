package com.org.tav.day5;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		try {
		//step 1
		Class.forName("org.postgresql.Driver");
		//step 2
		c = DriverManager
		.getConnection("jdbc:postgresql://localhost:5432/dedrental","postgres", "password");
		} catch (Exception e) {
		e.printStackTrace();
		System.err.println(e.getClass().getName()+": "+e.getMessage());
		System.exit(0);
		}
		System.out.println("Opened database successfully");

	}

}
