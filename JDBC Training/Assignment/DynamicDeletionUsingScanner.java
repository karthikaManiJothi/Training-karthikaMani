package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDeletionUsingScanner {
    static Connection con =null;
    static PreparedStatement pstmt =null;
    
	public static void main(String[] args) {
     try {
    	    Class.forName("com.mysql.jdbc.Driver");
    	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillStudent?user=onebill&password=onebill");
    	    
			String query = "delete from student where sid=?";
			pstmt =con.prepareStatement(query);
			
			//Using Scanner 
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the sid to delete from the table:");
			int sid = sc.nextInt();
			pstmt.setInt(1, sid);
			
		 }catch(Exception e) {
    	 System.out.println("Exception");
      }
     finally {
			try {
	    		   if(con!=null)
	    			   con.close();
	    		   if(pstmt!=null)
	    			   pstmt.close();
	    	      }catch(SQLException e) {
	    		   e.printStackTrace();
	    	      }
		}
	}

}
