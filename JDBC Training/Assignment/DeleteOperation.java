package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteOperation {
	    
		static Connection con =null;
		static Statement stmt =null;
	    static ResultSet rs =null; 
	    
		public static void main(String[] args) throws ClassNotFoundException {
			try {
				 
				Class.forName("com.mysql.jdbc.Driver");
				
	        	con =DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillStudent?user=onebill&password=onebill");
	        	
	            String query ="delete from student where sid=2";  //static query
	            
	       	    stmt =con.createStatement();
	    	    int count =stmt.executeUpdate(query);
	    	    
	    	    System.out.println("No of records deleted:"+count);
	    	   
	             }catch(SQLException e) {
	    	          e.printStackTrace();
	             }
			
			   //close all JDBC Objects
				finally {
					try {
						if(con!=null)
							con.close();
						if(stmt!=null)
							stmt.close();
						if(rs!=null)
							rs.close();
					}
					catch(Exception e) {
						System.out.println("Exception");
					}
			   }
		}

	}
