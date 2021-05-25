package com.onebill.handson.exce;

// demonstrating interface inside concrete class

 class Test{
	interface Demo{
		void display();
	 }
 }
 class Testing implements Test.Demo{

	@Override
	public void display() {

		System.out.println("display");
	}
	 
 }
public class InterfaceInsideClass {

	public static void main(String[] args) {
     Testing test =new Testing();
     test.display();
	}

}
