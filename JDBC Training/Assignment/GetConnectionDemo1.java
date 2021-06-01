package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConnectionDemo1{
	static Connection con=null;
	static Statement stmt=null;

	public static void main(String[] args) throws ClassNotFoundException {
        try {
        	
        	Class.forName("com.mysql.jdbc.Driver");
        	
        	//2. getConnection using (String url, String user,String password)
            String db_url ="jdbc:mysql://localhost:3306/OneBillBankDB";
            String user = "onebill";
            String password ="onebill";
        	con =DriverManager.getConnection(db_url,user,password);
        	
            String query ="insert into Employee values(1,'Sundeep',450000)";  //static query
      
       	   stmt =con.createStatement();
    	   int count =stmt.executeUpdate(query);
    	   
    	    System.out.println("No of records inserted :"+count);
           }
           catch(SQLException e) {
    	        e.printStackTrace();
            }
            
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
