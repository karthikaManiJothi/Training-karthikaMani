package com.onebill.training.assignment.errors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Employee{
   String name;
   int id;
   Employee(String name,  int id){
      this.name = name;
      this.id = id;
   }
   public void displayDetails(){
      System.out.println("Name: "+this.name);
      System.out.println("Id: "+this.id);
   }
}

public class TryWithResources2 {
	   public static void main(String args[]) {
		   try(BufferedReader reader =new BufferedReader(new InputStreamReader(System.in))){
	              System.out.println("Enter your name: ");
	              String name = reader.readLine();
	              System.out.println("Enter your Id: ");
	              int id = Integer.parseInt(reader.readLine());
	              Employee std = new Employee(name, id);
	              std.displayDetails();
	        }
		   catch(Exception e) {
			   System.out.println("Wrong Input");
		   }
	   }
	}


