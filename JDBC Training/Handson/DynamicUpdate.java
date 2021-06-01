package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicUpdate {
    static Connection con =null;
    static PreparedStatement pstmt =null;
    
	public static void main(String[] args) {
     try {
    	    Class.forName("com.mysql.jdbc.Driver");
    	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillStudent?user=onebill&password=onebill");
			String query = "update student set sname= ?,marks=? where sid=3";
			pstmt =con.prepareStatement(query);
			String newname =args[0];
			int newmarks =Integer.parseInt(args[1]);
			pstmt.setString(1, newname);
			pstmt.setInt(2, newmarks);
			
			boolean flag = pstmt.execute();
			System.out.println(flag);
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
