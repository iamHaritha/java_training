package com.dbcon.day3;
import java.sql.*;
import java.util.*;
public class ScannerEx {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student  Id");
	int sid=sc.nextInt();
	System.out.println("Enter Student Name");
	String sname=sc.next();
	System.out.println("Enter Student Branch");
	String sbranch=sc.next();
	Class.forName("com.mysql.cj.jdbc.Driver");//Register and Load the database driver
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");//Connection
	
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
	ps.setInt(1,sid);
	ps.setString(2, sname);
	ps.setString(3,sbranch);
	int i=ps.executeUpdate();
	System.out.println(i+ " record inserted successfully...");
}
}
