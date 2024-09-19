package com.deloitte.demo.day4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	// Display id, name, salary of all the employees and handle exceptions

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vaman";
		String user = "root";
		String password = "root";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM emps")) {

			System.out.println("Connected...");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}

//package com.deloitte.demo.day4.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JdbcDemo {
//	
//	// display id, name, salary of all the emps 
//	// handle exceptions 
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		String url = "jdbc:mysql://localhost:3306/vaman";
//		String user = "root";
//		String password = "root";
//
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection(url, user, password);
//		System.out.println("Connected...");
//		stmt = conn.createStatement();
//		String sql = "SELECT * FROM emps";
//		rs = stmt.executeQuery(sql);
//
//		while (rs.next()) {
//			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary") );
//		}
//
//		rs.close();
//		stmt.close();
//		conn.close();
//	}
//
//}
//
////CREATE TABLE emps (id INT, name VARCHAR(10), salary DECIMAL);
//
////SELECT * FROM emps;
//
////INSERT INTO emps (id, name, salary) VALUES (101, 'Sonu', 90.75);
////INSERT INTO emps (id, name, salary) VALUES (102, 'Monu', 95.50);
////INSERT INTO emps (id, name, salary) VALUES (103, 'Tonu', 92.25);
//
////COMMIT;
//
////SELECT * FROM emps;
//
