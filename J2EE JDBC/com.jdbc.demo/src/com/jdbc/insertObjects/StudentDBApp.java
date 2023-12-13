package com.jdbc.insertObjects;

import java.sql.*;

public class StudentDBApp {
	static String url = "jdbc:mysql://localhost/jdbc_practice";
	static String user = "root";
	static String password = "rootvig26";
	
	public static void insertObj(Student st) {
		int id = st.getId();
		String name = st.getName();
		String branch = st.getBranch();
		
		String sql = "INSERT INTO st_app VALUES(?, ?, ?)";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);		
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, branch);
			
			ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
}
