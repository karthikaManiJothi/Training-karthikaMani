package com.onebill.training.day10.handson;

interface FunctionalInt{
	void abstractmethod(int x);
	
	default void normalMethod() {
		System.out.println("Hello from normalMethod");
	}
	
	static void staticMethod() {
		System.out.println("Hello from static method..");
	}
}
public class LambdaTest {

	public static void main(String[] args) {
      FunctionalInt refer =(int x) -> {
    	  System.out.println("Hello from abstractMethod");
      };
      
      refer.abstractmethod(20);
      refer.normalMethod();
      FunctionalInt.staticMethod();
}
}
