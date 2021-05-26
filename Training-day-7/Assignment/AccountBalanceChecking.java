package com.onebill.training.assignment.errors;

import java.util.Scanner;

//   MinimumBalanceException 
class MinimumBalanceException extends Exception{
	   public MinimumBalanceException(String s){
		   super(s);
	   }
 }

//    NegativeBalanceException
class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String s) {
		super(s);
	}
}

class CustomerAccount{
	 int amount =0;               
	 
     public void deposit(int amt){ 
    	 System.out.println("Deposited Amount:"+amt);     // depositing
         this.amount+=amt;  
      }  
     
     public void withdraw(int withdrawamt){              //  withdrawing
            try{
            	if(this.amount<1000) {
            		// calling MinimumBalanceException 
            		throw new MinimumBalanceException("balance is low! not able to withdraw");
            	}
            	else {
            		if(withdrawamt<0) {
            			// calling NegativeBalanceException
            			throw new NegativeBalanceException("You have entered negative value");
            		}
            		else {
            			System.out.println("Withdraw Amount:"+withdrawamt);
            			this.amount-=withdrawamt; 
            		    }
                }
                }catch(Exception e){
                	System.out.println(e.getMessage());
                	//System.exit(0);
                }  
       }
     
      public void availableBalance() {
    	  System.out.println("Available Balance:"+this.amount);
      }
             
          
}

public class AccountBalanceChecking {

	public static void main(String[] args) {
		CustomerAccount customer =new CustomerAccount();
		Scanner sc =new Scanner(System.in);
		while(true) {
		System.out.println("1.Deposit\n2.Withdraw\n3.Balance\n4.Cancel");
		System.out.print("Enter your choice:");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
		     System.out.println("Amount to be deposited ?:");
		     int deposit =sc.nextInt();
		     customer.deposit(deposit);
		     break;
		case 2:
			System.out.println("how much amount do you need to withdraw ?");
			int amount =sc.nextInt();
			customer.withdraw(amount);
			break;
		case 3:
			customer.availableBalance();
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			
	    }
		System.out.println();
	    }
	}
	
}

