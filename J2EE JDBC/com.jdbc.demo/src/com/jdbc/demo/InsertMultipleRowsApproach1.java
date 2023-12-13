package com.jdbc.demo;
import java.sql.*;

public class InsertMultipleRowsApproach1 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbc_practice";
		String user = "root";
		String password = "rootvig26";
		String sql1 = "INSERT INTO student VALUES(106, 'Nobi')";
		String sql2 = "INSERT INTO student VALUES(107, 'Doraemon')";
		String sql3 = "INSERT INTO student VALUES(108, 'Suzuka')";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement statement = con.createStatement();
			statement.executeUpdate(sql1);
			statement.executeUpdate(sql2);
			statement.executeUpdate(sql3);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
