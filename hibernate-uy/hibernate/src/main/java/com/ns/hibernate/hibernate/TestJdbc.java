package com.ns.hibernate.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to dababase: " + jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection is successful");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
