package com.onebill.assignment.exec;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	      System.out.print("Enter number:");
	      int n =sc.nextInt();
	      for (int i=0; i<n; i++)
	        {
	            for (int j=n-i; j>1; j--)
	            {
	                System.out.print(" ");
	            }
	  
	            for (int j=0; j<=i; j++ )
	            {
	                System.out.print((i+1)+" ");
	            }
	  
	            System.out.println();
	       }
	      sc.close();

	}
}
