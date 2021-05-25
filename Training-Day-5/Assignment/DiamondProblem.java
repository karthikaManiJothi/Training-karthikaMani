package com.onebill.assignment.exec;

interface Interface1 {  
 default void display() {  
          System.out.println("Interface1 method invoked");  
   }  
}  

interface Interface2 {  
  default void display() {  
        System.out.println("Interface2 method invoked");  
   }  
} 

class InterfaceImplementationClass implements Interface1, Interface2 {  
   public void display()  {
	Interface1.super.display();  
	Interface2.super.display();  
}
}
public class DiamondProblem {

	public static void main(String[] args) {
		InterfaceImplementationClass obj = new InterfaceImplementationClass();  
		obj.display();  
	}

}
