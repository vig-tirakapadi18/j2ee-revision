package com.jdbc.demo;
import java.sql.*;

public class BankApp {
	static String url = "jdbc:mysql://localhost/jdbc_practice";
	static String user = "root";
	static String password = "rootvig26";
	
	public static void main(String[] args) {
//		createTable();
//		createAccount();
		updateBalance();
	}
	
	static void createTable() {
		String sql = "CREATE TABLE bank(accNum int, name VARCHAR(10), balance int)";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static void createAccount() {
		String sql1 = "INSERT INTO bank VALUES(101, 'Vig', 65000)";
		String sql2 = "INSERT INTO bank VALUES(102, 'Vis', 95000)";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			st.addBatch(sql1);
			st.addBatch(sql2);
			st.executeBatch();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void updateBalance() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			con.setAutoCommit(false);		//step - I
			
			String sql1 = "UPDATE bank SET balance=65000 WHERE accNum=101";
			String sql2 = "UPDATE ban SET balance=85000 WHERE accNum=102";
			
			Statement st = con.createStatement();
			st.addBatch(sql1);
			st.addBatch(sql2);
			st.executeBatch();
			
			con.commit();		//step - II
		} catch(Exception e) {
			System.out.println(e.getMessage());
			try {
				con.rollback();		//step - III		
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
