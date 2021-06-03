package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PlayingParticularSong {
	
	static Connection con =null;
	static PreparedStatement pstmt =null;
	static ResultSet rs =null;
	Scanner sc =new Scanner(System.in);

    public void songByUserChoice() {
    	 try {
		     
		     Class.forName("com.mysql.jdbc.Driver");
			 String url ="jdbc:mysql://localhost:3306/MusicPlayer";
			 String user ="onebill";
			 String password ="onebill";
			 con =DriverManager.getConnection(url, user, password);
			 
			 //getting particular song title from the user...
			 String query ="select * from MusicFiles where Song_Title=?";
			 pstmt=con.prepareStatement(query);
			 
			 System.out.println("select the Song_Title to be played");
			 String song_title =sc.nextLine();
			 pstmt.setString(1, song_title);
			 rs = pstmt.executeQuery();
			 
			 while(rs.next()) {
			      String song =rs.getString("Song_Title");
			      System.out.println(" Playing the song....."+song);
			 }
			 
            } catch(Exception e) {
   		       System.out.println("Exception:"+e.getMessage());
               }
    	     finally {
  		         try {
  			          if(con!=null)
  				          con.close();
  			          if(pstmt!=null)
  				            pstmt.close();
  			          if(rs!=null)
  				           rs.close();
  		           }catch(Exception e) {
  			             System.out.println("Exception:"+e.getMessage());
  		            }
  	         }
    }
}
