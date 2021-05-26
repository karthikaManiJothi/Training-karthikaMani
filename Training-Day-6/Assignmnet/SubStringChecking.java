package com.onebill.training.assignment.array;

import java.util.Scanner;

public class SubStringChecking {

	public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("String :");
       String str =sc.nextLine();
       System.out.print("SubString:");
       String str1=sc.nextLine();
       if(str.contains(str1)) {
    	   System.out.println("Substring is available");
       }
       else {
    	   System.out.println("Substring is not available");
       }
       sc.close();
	}

}
