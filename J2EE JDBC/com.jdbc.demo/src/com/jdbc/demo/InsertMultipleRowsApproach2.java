package com.jdbc.demo;
import java.sql.*;

public class InsertMultipleRowsApproach2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbc_practice";
		String user = "root";
		String password = "rootvig26";
		String sql1 = "INSERT INTO student VALUES(108, 'Suzuka')";
		String sql2 = "INSERT INTO student VALUES(109, 'Suniyo')";
		String sql3 = "INSERT INTO student VALUES(110, 'Dorami')";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			st.addBatch(sql1);
			st.addBatch(sql2);
			st.addBatch(sql3);
			
			st.executeBatch();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
