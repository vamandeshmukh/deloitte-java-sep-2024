package com.deloitte.demo.day4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vaman";
		String user = "root";
		String password = "root";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected...");

			String sql = "INSERT INTO emps (id, name, salary) VALUES (?, ?, ?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 105); 
			pstmt.setString(2, "GonuGonuGonuGonu"); 
			pstmt.setDouble(3, 88.50); 

			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Done");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
