package com.onebill.training.ass.threads;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseralization {

	public static void main(String[] args) {
		 Studentinfo e = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("Student.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Studentinfo) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.sid);
	      
	}

}
