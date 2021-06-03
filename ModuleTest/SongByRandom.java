package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SongByRandom {
	
	   static Connection con =null;
	   static Statement stmt =null;
	   static ResultSet rs =null;
	   
       public void playingSongsByRandom() {
    	   
    	  try {
     	     Class.forName("com.mysql.jdbc.Driver");
 			 String url ="jdbc:mysql://localhost:3306/MusicPlayer";
 			 String user ="onebill";
 			 String password ="onebill";
 			 con =DriverManager.getConnection(url, user, password);
 			 
 			 //playing the songs randomly .....
 			 String query ="select * from MusicFiles order by rand() ";
 			 stmt =con.createStatement();
 			 rs=stmt.executeQuery(query);
 			 
 			 while(rs.next()) {
 				 String song =rs.getString("Song_Title");
 				 System.out.println("Playing the song...."+song);
 				 
 				 // each song will play for 10 seconds.....
 				 Thread.sleep(10000);
 			 }
              }catch(Exception e) {
     	       System.out.println("Exception !...");
              }
    	   finally {
   		     try {
   			   if(con!=null)
   				   con.close();
   			   if(stmt!=null)
   				   stmt.close();
   			   if(rs!=null)
   				   rs.close();
   		       }catch(Exception e) {
   			       System.out.println("Exception:"+e.getMessage());
   		     }
   	   }
      }
}
