package com.jdbc.demo;
import java.sql.*;

public class ConnectionJavaAndSQL {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbc_practice";
		String user = "root";
		String password = "rootvig26";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established! "+con);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				con.close();				
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
