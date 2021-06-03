package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseAndTableCreation {
	
    static Connection con=null;
    static Statement stmt =null;
    
	public static void main(String[] args) {
		
         try {
        	 Class.forName("com.mysql.jdbc.Driver");
        	 
        	 String url="jdbc:mysql://localhost:3306/";
        	 String user ="onebill";
        	 String password ="onebill";
        	 con =DriverManager.getConnection(url, user, password);
        	 
        	 stmt =con.createStatement();
        	 
        	 stmt.executeUpdate("create database MusicPlayer");   //database creation
        	 stmt.executeUpdate("use MusicPlayer");               
        	 String query="create table MusicFiles(Song_ID int(10) auto_increment primary key,Song_Title varchar(50),Artist_Name varchar(50),Album_Name varchar(50),Song_Location varchar(50), Description varchar(250))";
        	 stmt.executeUpdate(query);                         //table creation
        	 
        	 System.out.println("MusicPlayer Database and MusicFiles Table created successfully");
        	 
         }catch(Exception e) {
        	 System.out.println("Exception ! :"+e.getMessage());
         }
         finally {
        	 try {
        		 if(con!=null)
        			con.close();
        		 if(stmt!=null)
        			 stmt.close();
        	 }catch(Exception e) {
        		 System.out.println("Exception :"+e.getMessage());
        	 }
         }
	}

}
