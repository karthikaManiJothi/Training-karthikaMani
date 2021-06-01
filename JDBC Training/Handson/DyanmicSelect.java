package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DyanmicSelect {
	static Connection con =null;
	static PreparedStatement pstmt =null;
	static ResultSet rs =null;

	public static void main(String[] args) {
        
		//Class.forName("com.mysql.jdbc.Driver");
		//Driver driverref =new Driver();
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillStudent?user=onebill&password=onebill");
			String query = "Select * from student where sid=?";
			pstmt =con.prepareStatement(query);
			String studentid = args[0];
			int student_id =Integer.parseInt(studentid);
			//binding the parameter
			pstmt.setInt(1, student_id);
			rs =pstmt.executeQuery();
			if(rs.next()) {
				int s_id =rs.getInt("sid");
				String sname =rs.getString("sname");
				int s_marks =rs.getInt("marks");
				System.out.println("Student sid:"+s_id);
				System.out.println("Student Name:"+sname);
				System.out.println("Student marks:"+s_marks);
			}
			else {
				System.out.println("Not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
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
