package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicMethodDemo2 {
	static Connection con =null;
	static PreparedStatement pstmt =null;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillStudent?user=onebill&password=onebill");
			String query = "insert into student values(?,?,?,?)";
			String s_id=args[0];
			String s_name =args[0];
			String s_marks =args[2];
			int sid = Integer.parseInt(s_id);
			int smarks =Integer.parseInt(s_marks);

			pstmt =con.prepareStatement(query);
			
			pstmt.setInt(1, sid);
			pstmt.setString(2, s_name);
			pstmt.setInt(3, smarks);
			
			pstmt.executeUpdate();
			System.out.println("Insertion Successfully");
	}catch(Exception e) {
		System.out.println("Exception !!");
	}
	}
}
