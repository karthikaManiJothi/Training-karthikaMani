package com.onebill.training.assignment.array;

public class StringComparsion {

	public static void main(String[] args) {
		
		  String s1 = new String("HELLO");
		  String s2 = new String("HELLO");
				
		   // == is an operator..checks if both objects point to  same memory location
		  // equals() is a method..compare the values in the objects
				
		  System.out.println(s1 == s2);      //false
		  System.out.println(s1.equals(s2)); //true
		  
		  String s3 ="java";
		  String s4 = s3;
		  System.out.println(s3.hashCode());
		  System.out.println(s4.hashCode());
		  
		  System.out.println(s3 == s4);      //true
		  System.out.println(s3.equals(s4)); //true
			}
		}


