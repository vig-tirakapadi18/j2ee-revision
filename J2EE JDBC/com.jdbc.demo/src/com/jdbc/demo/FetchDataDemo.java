package com.jdbc.demo;
import java.sql.*;

public class FetchDataDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbc_practice";
		String user = "root";
		String password = "rootvig26";
		String sql = "SELECT * FROM student";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" - "+rs.getString(2));
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
