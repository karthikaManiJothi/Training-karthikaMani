package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DatadaseEditClass {
	
  static Connection con =null;
  static PreparedStatement pstmt =null;
  Scanner sc =new Scanner(System.in);
  
  public void editing() {
	  try {
		     Class.forName("com.mysql.jdbc.Driver");
			 String url ="jdbc:mysql://localhost:3306/MusicPlayer";
			 String user ="onebill";
			 String password ="onebill";
			 con =DriverManager.getConnection(url, user, password);
			 String query;
			 System.out.println("which song(Song_ID) do you want to edit:");
			 int song_id =sc.nextInt();
			 System.out.println("What do you want to edit on that song:\n1.Song_Title\n"
			 		+ "2.Artist_name\n3.Album_Name\n4.Song_Location\n5.Description");
			 System.out.println("Enter your choice:");
			 int choice =sc.nextInt();
			 sc.nextLine();
			 switch(choice) {
			 case 1:
				 query ="update MusicFiles set Song_Title=? where Song_ID=?";
				 System.out.println("Enter new Song_Title to edit:");
				 String new_songtitle =sc.nextLine();
				 pstmt=con.prepareStatement(query);
				 pstmt.setString(1, new_songtitle);
				 pstmt.setInt(2, song_id);
				 pstmt.execute();
				 System.out.println("Song Title Edited Successfully!");
				 break;
			 case 2:
				 query ="update MusicFiles set Artist_Name =? where Song_ID=?";
				 System.out.println("Enter Artist name to edit:");
				 String artist_name =sc.nextLine();
				 pstmt =con.prepareStatement(query);
				 pstmt.setString(1, artist_name);
				 pstmt.setInt(2, song_id);
				 pstmt.execute();
				 System.out.println("Artist name edited Successfully");
				 break;
			 case 3:
				 query="update MusicFiles set Album_Name=? where Song_ID=?";
				 System.out.println("Enter Album Name to edit:");
				 String album_name =sc.nextLine();
				 pstmt =con.prepareStatement(query);
				 pstmt.setString(1, album_name);
				 pstmt.setInt(2, song_id);
				 pstmt.execute();
				 System.out.println("Album Name edited Successfully");
				 break;
			 case 4:
				 query="update MusicFiles set Song_Location=? where Song_ID=?";
				 System.out.println("Enter Song Location to edit:");
				 String location =sc.nextLine();
				 pstmt =con.prepareStatement(query);
				 pstmt.setString(1, location);
				 pstmt.setInt(2, song_id);
				 pstmt.execute();
				 System.out.println("Song Location edited Successfully");
				 break;
			 case 5:
				 query="update MusicFiles set Description=? where Song_ID=?";
				 System.out.println("Type Description to edit:");
				 String desc =sc.nextLine();
				 pstmt =con.prepareStatement(query);
				 pstmt.setString(1, desc);
				 pstmt.setInt(2, song_id);
				 pstmt.execute();
				 System.out.println("Description edited Successfully");
				 break;
			 default:
				 System.out.println("Invalid Choice!...try again");
				 System.exit(0);
				 }
			  }catch(Exception e) {
				  System.out.println("Exception in Editing:"+e.getMessage());
			  }
	        finally {
	        	try {
	        		if(con!=null)
	        			con.close();
	        		if(pstmt!=null)
	        			pstmt.close();
	        	}catch(Exception e) {
	        		System.out.println("Exception!"+e.getMessage());
	        	}
	        }
	  
  }
}
