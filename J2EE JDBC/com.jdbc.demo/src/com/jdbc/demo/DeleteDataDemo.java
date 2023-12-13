package com.jdbc.demo;
import java.sql.*;

public class DeleteDataDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbc_practice";
		String user = "root";
		String password = "rootvig26";
		String sql = "DELETE FROM student WHERE id=108";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement statement = con.createStatement();
			statement.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
