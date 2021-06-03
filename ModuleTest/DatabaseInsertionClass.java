package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DatabaseInsertionClass {
     static Connection con =null;
     static PreparedStatement pstmt =null;
     Scanner sc =new Scanner(System.in);
	 public void adding() {
		 
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 String url ="jdbc:mysql://localhost:3306/MusicPlayer";
			 String user ="onebill";
			 String password ="onebill";
			 con =DriverManager.getConnection(url, user, password);
			 String query ="insert into MusicFiles(Song_Title,Artist_Name,Album_Name,Song_Location,Description) values(?,?,?,?,?)";
			 pstmt =con.prepareStatement(query);
			 System.out.println("Enter Song_Title:");
			 String song_title =sc.nextLine();
			 System.out.println("Enter Artist_Name:");
			 String artist_name =sc.nextLine();
			 System.out.println("Enter Album_Name:");
			 String album_name =sc.nextLine();
			 System.out.println("Enter Song_Location:");
			 String location =sc.nextLine();
			 System.out.println("Type Description:");
			 String desc =sc.nextLine();
			 
			 pstmt.setString(1, song_title);
			 pstmt.setString(2, artist_name);
			 pstmt.setString(3, album_name);
			 pstmt.setString(4, location);
			 pstmt.setString(5, desc);
			 pstmt.executeUpdate();
			 
			 System.out.println("Inserted Successfully");
			 }catch(Exception e) {
				 System.out.println("Exception in Insertion:"+e.getMessage());
			 }
		 finally {
			 try {
				 if(con!=null)
					 con.close();
				 if(pstmt!=null)
					 pstmt.close();
			 }catch(Exception e) {
				 System.out.println("Exception:"+e.getMessage());
			 }
		 }
	 }
}
