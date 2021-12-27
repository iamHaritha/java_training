package com.dbcon.day3;
import java.sql.*;
public class Prepared {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");//Register and Load the database driver
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");//Connection
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
	ps.setInt(1,105);
	ps.setString(2,"Praveen");
	ps.setString(3,"MECH");
	int i=ps.executeUpdate();
	System.out.println(i+ " record inserted successfully...");
}
}

