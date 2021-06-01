package com.onebill.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputFromTextFile {
	 static Connection con =null;
	 static PreparedStatement pstmt =null;

	public static void main(String[] args) {
		
	try {
    	
    	Class.forName("com.mysql.jdbc.Driver");
    	
        String db_url ="jdbc:mysql://localhost:3306/OneBillBankDB";
        String user = "onebill";
        String password ="onebill";
    	con =DriverManager.getConnection(db_url,user,password);
    	
        String query ="insert into Employee values(?,?,?)";  
        pstmt =con.prepareStatement(query);
        
        FileReader fr =new FileReader("/home/karthika/Desktop/input.txt");
        BufferedReader br =new BufferedReader(fr);
        String[] record =null;
        String line;
        
        while((line =br.readLine())!=null){
        	record =line.split(" ");
        }
        String emp_id=record[0];
		String emp_name =record[1];
		String emp_salary =record[2];
		int empid = Integer.parseInt(emp_id);
		int empsalary =Integer.parseInt(emp_salary); 
		
		pstmt.setInt(1, empid);
		pstmt.setString(2, emp_name);
		pstmt.setInt(3, empsalary);
		pstmt.executeUpdate();
        
		System.out.println("Inserted Successfully");
		
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
