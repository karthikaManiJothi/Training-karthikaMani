package com.onebill.assignment.exec;

import java.util.Scanner;

public class CubeOfaNumber {

	public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter number:");
       int n =sc.nextInt();
       int cubevalue;
       for(int i=1;i<=n;i++) {
    	   cubevalue=i*i*i;
    	   System.out.println("cube of "+ i+":"+cubevalue);
    	   cubevalue=1;
       }
       sc.close();
	}

}
