package com.onebill.training.assignment.array;

import java.util.Scanner;

public class RiderProblem {

	public static void main(String[] args) {
		 int riders_weekend=0;
		 int riders_weekdays=0;
		 int total_kms_weekend=0;
		 int total_kms_weekdays=0;
	     Scanner sc =new Scanner(System.in);
	     System.out.print("Number of riders:");
	     int n =sc.nextInt();
	     for(int i=0;i<n;i++) {
	    	 System.out.println("-------rider"+(i+1)+"---------");
	    	  System.out.println("are you a rider (yes/no)?");
	          String rider =sc.next();
	          if(rider.equalsIgnoreCase("yes")) {
	    	      System.out.println("On which day did you drive ?:\n1.Weekend\n2.weekdays");
	    	      int day =sc.nextInt();
                  if(day==1) {
            	      System.out.println("How many kms did you drive on that day?");
            	      int we_kms =sc.nextInt();
            	      total_kms_weekend+=we_kms;
            	      riders_weekend+=1;
	         }
             else if(day==2) {
            	 System.out.println("How many kms did you drive on that day ?");
            	  int wd_kms =sc.nextInt();
            	  total_kms_weekdays+=wd_kms;
            	  riders_weekdays+=1;
             }
	      }
	    }
	     System.out.println("No of riders on weekdays: "+riders_weekdays);
	     System.out.println("No of riders on weekends: "+riders_weekend);
	     System.out.println("Total kms travelled in weekdays: "+total_kms_weekdays);
	     System.out.println("Total kms travelled in weekends: "+total_kms_weekend);
	     sc.close();
	}
}
