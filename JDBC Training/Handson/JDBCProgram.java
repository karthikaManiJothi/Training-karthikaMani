package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {
	static Connection con=null;
	static Statement stmt=null;

	public static void main(String[] args) throws ClassNotFoundException {
        try {
        	
        	//1.Load the driver
        	Class.forName("com.mysql.jdbc.Driver");
        	
        	//2. get DB connection via Driver
            String db_url ="jdbc:mysql://localhost:3306/onebillStudent?user=onebill&password=onebill";
        	con =DriverManager.getConnection(db_url);
        	
        	//3.Issue SQL query via connection
            String query ="insert into student values(5,'Reshma',90)";  //static query
      
       	   stmt =con.createStatement();
    	   int count =stmt.executeUpdate(query);
    	   
    	   //4.Process resultSet returned by sql query
    	   System.out.println("No of records inserted :"+count);
             }catch(SQLException e) {
    	   e.printStackTrace();
             }
            
          //5.close all JDBC objects
          finally {
    	     try {
    		   if(con!=null)
    			   con.close();
    		   if(stmt!=null)
    			   stmt.close();
    	      }catch(SQLException e) {
    		   e.printStackTrace();
    	      }
           }
	 }

}
