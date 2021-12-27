package com.dbcon.day3;

import java.sql.*;

public class DBConn {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");// Register and Load the database driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");// Connection
		Statement st = con.createStatement();// Initialize the statement
		//st.execute("create table student(Id int,Name varchar(20),Branch varchar(20))");
		//st.execute("insert into student values(101,'Karthik','EEE')");
		st.execute("insert into student values(102,'Mohan','CSE')");
		//st.execute("insert into student values(103,'Haritha','ECE')");
		st.execute("update student set Name='Mahesh',Branch='ECE' where Id=103");
		//st.execute("delete from student where Id=102");
		ResultSet rs = st.executeQuery("select * from student");
		
		while (rs.next()) {
			System.out.println(rs.getInt("Id") + " " + rs.getString("Name") + " " + rs.getString("Branch"));
		}
	}
}
