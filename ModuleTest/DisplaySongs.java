package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplaySongs {
	
	static Connection con = null;
	static Statement stmt =null;
	static ResultSet rs=null;
    public void displaySongs() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		String url ="jdbc:mysql://localhost:3306/MusicPlayer";
    		String user ="onebill";
    		String password ="onebill";
    		con =DriverManager.getConnection(url, user, password);
    		stmt =con.createStatement();
    		//display songs -order by title
    		rs=stmt.executeQuery("select * from MusicFiles order by Song_Title");
    		System.out.println("-----------------------------");
    		System.out.println(         "Songs By Order");
    		System.out.println("-----------------------------");
    		while(rs.next()) {
    		String song =rs.getString("Song_Title");
    		System.out.println(song);
    		}
    		System.out.println("-----------------------------");
    	}catch(Exception e) {
    		System.out.println("Exception :"+e.getMessage());
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
    			System.out.println("Exception !"+e.getMessage());
    		}
    }
}
}
