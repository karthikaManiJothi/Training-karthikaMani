package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SongBySequenticalOrder extends Thread {
	
	   static Connection con =null;
	   static Statement stmt =null;
	   static ResultSet rs =null;
	   
       public void playingAllSongsBySequence() {
    	   
    	   try {
    	     Class.forName("com.mysql.jdbc.Driver");
			 String url ="jdbc:mysql://localhost:3306/MusicPlayer";
			 String user ="onebill";
			 String password ="onebill";
			 con =DriverManager.getConnection(url, user, password);
			 
			 //playing songs sequentically -- ordered by song title
			 String query ="select * from MusicFiles order by Song_Title ";
			 stmt =con.createStatement();
			 rs=stmt.executeQuery(query);
			 
			 while(rs.next()) {
				 String song =rs.getString("Song_Title");
				 System.out.println("Playing the song...."+song);
				 Thread.sleep(10000);      //after 10 seconds ,next song will play
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
