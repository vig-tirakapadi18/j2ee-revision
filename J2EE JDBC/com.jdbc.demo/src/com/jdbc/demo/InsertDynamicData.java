package com.jdbc.demo;
import java.sql.*;
import java.util.*;

public class InsertDynamicData {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/jdbc_practice";
		String user = "root";
		String password = "rootvig26";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		String sql = "INSERT INTO student VALUES(?, ?)";
		sc.close();
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		} finally {
			System.out.println("User added successfully!");
		}
	}
}
