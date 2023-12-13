package com.jdbc.demo;
import java.sql.*;

public class UpdateDataDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbc_practice";
		String user = "root";
		String password = "rootvig26";
		String sql = "UPDATE student SET name='Vishu' WHERE id=102";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement statement = con.createStatement();
			statement.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
