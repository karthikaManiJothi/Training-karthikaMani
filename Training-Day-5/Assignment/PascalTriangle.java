package com.onebill.assignment.exec;

import java.util.Scanner;

public class PascalTriangle {
	   static int factorial(int n) {
	      int fac;

	      for(fac = 1; n > 1; n--){
	         fac *= n;
	      }
	      return fac;
	   }
	   static int pascal(int n,int m) {
	      return factorial(n) / ( factorial(n-m) * factorial(m) );
	   }
	   public static void main(String args[]){
	      Scanner sc =new Scanner(System.in);
	      System.out.print("Enter Number:");
	      int n=sc.nextInt();
	     
	      for(int i = 0; i <= n; i++) {
	         for(int j = 0; j <= n-i; j++){
	            System.out.print(" ");
	         }
	         for(int j = 0; j <= i; j++){
	            System.out.print(" "+pascal(i, j));
	         }
	         System.out.println();
	      }
	      sc.close();
	   }
	}