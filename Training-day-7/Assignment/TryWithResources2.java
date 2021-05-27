package com.onebill.training.assignment.errors;

import java.util.Scanner;

class Employee implements AutoCloseable{
  
   public void displayDetails(String name,int id){
      System.out.println("Name: "+name);
      System.out.println("Id: "+id);
   }
   @Override
   public void close() throws Exception {
	// TODO Auto-generated method stub
	}
}

public class TryWithResources2 {
	
	   public static void main(String args[]) {
		   Scanner sc =new Scanner(System.in);
		   try(Employee emp =new Employee()){
	              System.out.println("Enter your name: ");
	              String name = sc.nextLine();
	              System.out.println("Enter your Id: ");
	              int id =sc.nextInt();
	              emp.displayDetails(name,id);
	        }
		   catch(Exception e) {
			   System.out.println("Wrong Input");
		   }
		   sc.close();
	   }
	}


