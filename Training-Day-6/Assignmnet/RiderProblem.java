package com.onebill.training.assignment.array;

import java.util.Scanner;

public class RiderProblem {

	public static void main(String[] args) {
		int[][] riders = new int[2][];
		 int no_riders_weekend=0;
		 int no_riders_weekdays=0;
		 int not_riders=0;
	     Scanner sc =new Scanner(System.in);
	     System.out.print("Number of people needed for the Survey:");
	     int n =sc.nextInt();
	     int wecount=0,wdcount=0,total_weekendkms=0,total_weekdaykms=0;
	     riders[0] =new int[n];
		 riders[1] =new int[n];
	     for(int i=0;i<n;i++) {
	    	 System.out.println("..Person-"+(i+1)+"..");
	    	  System.out.println("are you a rider (yes/no)?");
	          String rider =sc.next();
	          if(rider.equalsIgnoreCase("yes")) {
	    	      System.out.println("On which day did you drive ?:\n1.Weekend\n2.weekdays");
	    	      int day =sc.nextInt();
	    	      switch(day){
	    	    	  case 1:
            	            System.out.println("How many kms did you drive on weekend [Saturday/Sunday]?");
            	            int kms =sc.nextInt();
            	            riders[0][wecount]=kms;
            	            no_riders_weekend+=1;
            	            wecount++;
            	            break;
	         
	    	    	  case 2: 
            	           System.out.println("How many kms did you drive on weekdays [Monday-Friday] ?");
            	           int km =sc.nextInt();
            	           riders[1][wdcount]=km;
            	           no_riders_weekdays+=1;
            	           wdcount++;
            	           break;
            	       default:
            	    	   System.out.println("Invalid choice!");
                    }
	          }
	          else {
	        	  System.out.println("Sorry! only riders are allowed!");
	        	  not_riders+=1;
	          }
	      }
	     
	     System.out.print("weekend kms: ");
	     for(int i:riders[0]) {
	    	 if(i==0) 
	    		 continue;                       
	        else
	        	total_weekendkms+=i;
	  	       System.out.print(i+" ");             //displaying kms of weekends
	      }
	     System.out.println();
	     
	     System.out.print("weekdays kms: ");
	     for(int i:riders[1]) {
	    	 if(i==0) 
	    		 continue;                                
	        else
	        	total_weekdaykms+=i;
	  	       System.out.print(i+" ");           //displaying kms of weekdays
	      }
	     
	     System.out.println();
	     System.out.println("Number of Non-riders:"+not_riders);
	     System.out.println("Number of weekend riders:"+no_riders_weekend);
	     System.out.println("Number of weekdays riders:"+no_riders_weekdays);
	     System.out.println("Total kms travelled in weekends: "+total_weekendkms);
	     System.out.println("Total kms travelled in weekdays: "+total_weekdaykms);
	     sc.close();
	}
}
