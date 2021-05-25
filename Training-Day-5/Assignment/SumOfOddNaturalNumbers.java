package com.onebill.assignment.exec;

import java.util.Scanner;

public class SumOfOddNaturalNumbers {

	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter number:");
      int n =sc.nextInt();
      int sumvalue=0;
      for(int i=1;i<=n;i++) {
    	  if(i%2==0) {
    		  continue;
    	  }
    	  else {
    	  sumvalue+=i;
    	  }
      }
      System.out.println("Sum of Odd Natural Number:"+sumvalue);
      sc.close();
	}

}
