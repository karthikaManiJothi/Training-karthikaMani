package com.onebill.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StoredProcedure {

		 static Connection con =null;
		 static PreparedStatement pstmt =null;
		 static CallableStatement cstmt = null;
			

		public static void main(String[] args) {
			
		try {
	    	
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	        String db_url ="jdbc:mysql://localhost:3306/Training";
	        String user = "onebill";
	        String password ="onebill";
	    	con =DriverManager.getConnection(db_url,user,password);
	    	String query = "call getordercount(?,?)";
            cstmt = con.prepareCall(query);
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the status:");
			String inputStatus = input.nextLine();
			
			cstmt.setString(1, inputStatus);
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			
			int count = cstmt.executeUpdate();
			int recordCount = cstmt.getInt(2);
			
			
			if (count != 0)
				System.out.println("Stored Procedure Called Successfully");
			else
				System.out.println("Error");
			
			input.close();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
​
		finally {
			try {
				if (con != null)
					con.close();
				if (cstmt != null)
					cstmt.close();
			} catch (Exception e2) {
				System.out.println("Exception!!");
			}
		}
​
	}

	}


