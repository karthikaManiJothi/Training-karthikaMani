package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class TableCreation{
	static Connection con =null;
	static Statement stmt =null;
   

	public static void main(String[] args) {
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. get DB connection via Driver
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillBankDB?user=onebill&password=onebill");
		
		 stmt =con.createStatement();
		    
		//3.Issue SQL query via connection
		 String query ="create table Employee(empid int primary key,empname varchar(50),empsalary int)";   //static query
	   
	     stmt.executeUpdate(query);
	     System.out.println("Table created Successfully!");
		}
		catch(Exception e) {
			System.out.println("");
		}
		
		//5.close all JDBC objects
		finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
				
			}catch(Exception e) {
				System.out.println("Exception");
			}
		}
		
	}

}


