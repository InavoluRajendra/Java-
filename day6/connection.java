package com.org.tav.day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		try {
		Class.forName("org.postgresql.Driver");
		c = DriverManager
		.getConnection("jdbc:postgresql://localhost:5432/Transactions",
		"postgres", "password");
		System.out.println("Opened database successfully");
		} catch ( Exception e ) {
		System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		System.exit(0);
		}
		

	}

}
