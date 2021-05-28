package com.onebill.training.ass.threads;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		
	 Scanner sc =new Scanner(System.in);
	 
     String[] juices = {"Apple       ","Muskmelon   ","Orange      ","Grape       ","Banana      ","Cucumber    ","Lemon       ","Watermelon  ","Pineapple   ","Pomegranate"};
     double[] price= {40,30,35,42,33,33,20,25,45,50};
     ArrayList<String> orders =new ArrayList<String>();
     ArrayList<Double> order_price =new ArrayList<Double>();
     ArrayList<Integer> quantity =new ArrayList<Integer>();
     
     int count=1,order;
     double sum=0;
     
     //displaying the available juices
     
     System.out.println("\t MenuCard");
     for(int i=0;i<juices.length;i++) {
    	 System.out.println(" >>> "+(i+1)+"."+juices[i]+" Juice : Rs. "+price[i]);
     }
     System.out.println();
     
     System.out.println("Place your orders:(if you have ordered enough,please press 0)");
     while(true) {
    	 System.out.print("Order "+ count+"(Select the number):");
         order =sc.nextInt();
         if(order!=0) {
              System.out.print("Quantity ?:");
              int q =sc.nextInt();
              orders.add((juices[order-1]));
              quantity.add(q);
              order_price.add(q*price[order-1]);
	     }
         else {
        	 System.out.println("Thank you!\n");
        	 break;
         }
         count++;
     }
     System.out.println("----------------------------");
     System.out.println("Your Final Bill:\n");
     System.out.println("Juice"+"    "+"Quantity"+" "+"Amount");
     for(int i=0;i<orders.size();i++) {
    	   sum+=order_price.get(i);
    	   System.out.println(orders.get(i)+"  "+quantity.get(i)+"   "+order_price.get(i) );
     }
     System.out.println("----------------------------");
     System.out.println(" Total amount = "+sum);
     System.out.println("----------------------------");
}
}
