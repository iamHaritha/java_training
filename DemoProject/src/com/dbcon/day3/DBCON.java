package com.dbcon.day3;

import java.sql.*;

public class DBCON {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");// Register and Load the database driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");// Connection
		System.out.println("connected successfully...");
	}
}
