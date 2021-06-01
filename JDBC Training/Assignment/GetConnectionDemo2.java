package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class GetConnectionDemo2{
	static Connection con=null;
	static Statement stmt=null;

	public static void main(String[] args) throws ClassNotFoundException {
        try {
        	
        	Class.forName("com.mysql.jdbc.Driver");
        	 
        	// getConnection using 2 parameters (String url,Properties info)
        	
            String db_url ="jdbc:mysql://localhost:3306/OneBillBankDB";
            Properties property_info = new Properties( );
            property_info.put( "user", "onebill" );
            property_info.put( "password", "onebill" );
        	con =DriverManager.getConnection(db_url,property_info);
        	
            String query ="insert into Employee values(2,'Kishan',550000)";  //static query
      
       	    stmt =con.createStatement();
    	    int count =stmt.executeUpdate(query);
    	   
    	    System.out.println("No of records inserted :"+count);
           }
           catch(SQLException e) {
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
