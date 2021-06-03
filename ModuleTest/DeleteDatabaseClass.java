package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDatabaseClass {
	
	static Connection con =null;
	static PreparedStatement pstmt =null;
	Scanner sc =new Scanner(System.in);
	
    public void deleting() {
	  try {
		     Class.forName("com.mysql.jdbc.Driver");
			 String url ="jdbc:mysql://localhost:3306/MusicPlayer";
			 String user ="onebill";
			 String password ="onebill";
			 con =DriverManager.getConnection(url, user, password);
			 
			 
			 System.out.println("Enter the Song ID to delete from the database:");
			 int id =sc.nextInt();
			 String query="delete from MusicFiles where Song_ID =?";
			 pstmt=con.prepareStatement(query);	
			 pstmt.setInt(1, id);
			 pstmt.execute();
			 System.out.println("Song Info-Deleted Successfully");
			 
	      }catch(Exception e) {
	    	 System.out.println("Exception while Deleting !"+e.getMessage());
	      }finally {
	    	 try {
	    		 if(con!=null)
	    			 con.close();
	    		 if(pstmt!=null)
	    			 pstmt.close();
	    	 }catch(Exception e) {
	    		 System.out.println("Exception :"+e.getMessage());
	    	 }
	     }
	  
  }
}
