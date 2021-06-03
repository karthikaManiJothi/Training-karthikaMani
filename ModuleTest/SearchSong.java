package com.onebill.training.moduletest.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class SearchSong {
	static Connection con =null;
	static PreparedStatement pstmt =null;
	static ResultSet rs =null;
	Scanner sc =new Scanner(System.in);
	
    public void searchSong() {
	   try {
		     HashMap<String,Integer> song_list =new HashMap<>();
		     
		     Class.forName("com.mysql.jdbc.Driver");
			 String url ="jdbc:mysql://localhost:3306/MusicPlayer";
			 String user ="onebill";
			 String password ="onebill";
			 con =DriverManager.getConnection(url, user, password);
			 String query ="select * from MusicFiles where Song_Title=?";
			 pstmt=con.prepareStatement(query);
			 while(true) {
			 System.out.println("select the Song Title to be Searched:");
			 String song_title =sc.nextLine();
			 pstmt.setString(1, song_title);
			 rs = pstmt.executeQuery(); 
			 System.out.println("---------------------------------------------------------------");
			 System.out.println("FILE Name\t\t|Attributes\t\t\t|Paly_Id");
			 while(rs.next()) {
				 
			      String song_name = rs.getString("Song_Title");
				   String artist =rs.getString("Artist_Name");
				   String album =rs.getString("Album_Name");
				   int id =rs.getInt("Song_ID");
				   song_list.put(song_name, id);
				   System.out.println(song_name+".mp3\t|"+artist+" "+album+"\t|"+id);
			     
			 }
			 System.out.println("---------------------------------------------------------------");
			 if(song_list.size()>=1) {
			      System.out.println("Enter the Song_ID  to play:");
			      int id =sc.nextInt();
			 
			       Set<Map.Entry<String,Integer>> song_entry_list =song_list.entrySet();
			       for(Entry<String,Integer> list: song_entry_list) {
		    	      if(id==list.getValue()) 
		    	    	 System.out.println(list.getKey()+" Song Playing....");
		    	      else 
		    	    	 System.out.println("Enter correct id...Please try again");
		    	    	 System.exit(0);
		    	    }	
			   }
			   else 
				 System.out.println("Song not found!..Please try again");
			     System.out.println();
			 }
	       }catch(Exception e) {
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
