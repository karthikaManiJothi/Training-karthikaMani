package com.onebill.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DisplayReslutsDemo {
	static Connection con =null;
	static Statement stmt =null;
    static ResultSet rs =null;
   

	public static void main(String[] args) {
		try {
			
		//1.Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. get DB connection via Driver
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillStudent?user=onebill&password=onebill");
		
		//3.Issue SQL query via connection
		String query ="select * from student";   //static query
	    stmt =con.createStatement();
	    
	    rs =stmt.executeQuery(query);
	    //4.Process resultSet returned by sql query
	    while(rs.next()) {
	    int student_id =rs.getInt("sid");
	    String student_name =rs.getString("sname");
	    int student_marks =rs.getInt("marks");
	    
	    System.out.println("Student ID:"+student_id);
	    System.out.println("Student Name:"+student_name);
	    System.out.println("Student Marks:"+student_marks);
	    
		}
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		//5.close all JDBC objects
		finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();
			}catch(Exception e) {
				System.out.println("Exception");
			}
		}
		
	}

}
