package com.onebill.training.assignment.errors;

import java.util.Scanner;

class NotEligibleException extends Exception{
	public NotEligibleException(String s) {
		super(s);
	}
}
public class StudentRegistrationValidation {

	public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        	 System.out.print("Enter Name:");
        	 String sname =sc.next();
        	 System.out.print("Enter Id:");
        	 int sid =sc.nextInt();
        	 sc.nextLine();
        	 System.out.print("Enter Email-id:");
        	 String semail =sc.nextLine();
        	 System.out.print("Enter Phone-Number:");
        	 long ph =sc.nextLong();
        	 System.out.print("Enter Age:");
        	 int age =sc.nextInt();
        	 System.out.print("Enter Weight:");
        	 int weight =sc.nextInt();
        	 try {
        	 if(age <12 || weight<35) {
        		 throw new NotEligibleException("Not eligible for registration !");            //exception
        	 }
        	 else {
        		 System.out.println("Registered Successfully!\n");
        		 System.out.println(" Details:");
        		 System.out.println("Name:"+sname+"\nId:"+sid+"\nEmail-Id:"+semail+"\nPhoneNo: "+ph+"\nAge: "+age+"\nWeight: "+weight);
        	 }
        	 }catch(Exception e) {
        		 System.out.println(e.getMessage());   //handling
        	 }
        
	  }

}
