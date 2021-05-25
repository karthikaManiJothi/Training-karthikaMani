package com.onebill.assignment.exec;

import java.util.Scanner;

public class IncreaingDecreaingFinding {

	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
	      System.out.print("Enter number:");
	      int n =sc.nextInt();
	      int num,count=0;
	      int numbers[]=new int[3];
	      while(n!=0) {               //converting into integer arrays
	    	  num=n%10;
	    	  numbers[count]=num;
	    	  n=n/10;
	    	  count++;
	      }
	      if(numbers[0]> numbers[1] && numbers[1]>numbers[2]) {
	    	  System.out.println("Increasing");
	      }
	      else if(numbers[0]<numbers[1] && numbers[1]<numbers[2]) {
	           System.out.println("Decreasing");
	      }
	      else {
	    	  System.out.println("Neither Increasing Nor Decreasing");
	      }
	      sc.close();
   }
}
