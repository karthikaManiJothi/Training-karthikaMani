package com.exc.cons;

import java.util.Scanner;

public class TernaryOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter your mark: ");
	    int marks = sc.nextInt();

	    	    boolean result = (marks > 35) ? true:false;
        if(result) {
	    System.out.println("Pass");
        }
        else {
        	System.out.println("fail");	
        }
	  

	}

}
