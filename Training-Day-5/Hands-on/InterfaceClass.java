package com.onebill.handson.exce;

interface MyInterface{
	void display();
	void method1();
}

class InterfaceClass1 implements MyInterface{

	@Override
	public void display() {
		System.out.println("my interface class implementation");
		
	}

	@Override
	public void method1() {
		System.out.println("method1 implementation");
		
	}
	
}
public class InterfaceClass {

	public static void main(String[] args) {
		MyInterface myinterface  = new InterfaceClass1();
        myinterface.display();
	}

}
