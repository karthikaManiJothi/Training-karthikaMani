package com.onebill.training.ass.threads;

import java.util.Scanner;

class Customer extends Thread{  
   int amount=100;  
   synchronized void withdraw(int amount){    
             try{
            	 if(this.amount<amount){  
                      System.out.println("Less balance"); 
            	      System.out.println("In waiting state..");
            	       wait();           //wait()
            	      
            	 }
             }catch(Exception e){
            	 System.out.println(e.getMessage());
               }  
            
          
           this.amount-=amount; 
           if(this.amount<0)
        	   System.out.println("Sorry! low Balance Transaction failed");
           else
              System.out.println("withdraw completed and remaining balance :"+this.amount); 
              System.exit(0);
     }  
  
    synchronized void deposit(int amount){  
          this.amount+=amount;  
          System.out.println(amount+" deposited..."); 
          notify();          //notify()
           }  
}  

public class AccountBalance {

	public static void main(String[] args) {
		final Customer c=new Customer();
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Amount need to be Withdraw:");
		int withdraw_amount =sc.nextInt();
		
		Thread t1 =new Thread(){  
		  public void run(){
			c.withdraw(withdraw_amount);
		  }  
		};t1.start(); 
		
		Thread t2=new Thread(){  
		   public void run(){
			   try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("how much amount  are you going to deposit ?");
			int deposit =sc.nextInt();
			c.deposit(deposit);
		   }  
		};t2.start();  
		
	}

}
