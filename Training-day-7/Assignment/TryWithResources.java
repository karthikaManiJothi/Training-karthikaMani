package com.onebill.training.assignment.errors;
import java.io.*;


public class TryWithResources {
	  public static void main(String[] args) {
	   String line;
	   
	    try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
	      while ((line = br.readLine()) != null) {
	           System.out.println(line);
	      }
	     } catch (IOException e) {
	           System.out.println("IOException: " + e.getMessage());
	     } finally {
	    	   System.out.println();
	           System.out.println("completed....");
	      }
	  }
 }


