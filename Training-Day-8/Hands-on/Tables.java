package com.onebill.training.threads;

public class Tables {
       public synchronized void printTable(int number) {  //for synchronizing a method, use synchronize keyword
    	   for(int i=1;i<=10;i++) {
    		   System.out.println(i*number);
    		   try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	   }
       }
}
