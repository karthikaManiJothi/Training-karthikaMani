package com.onebill.training.exe;

class Parent{
	void methodDemo() {
		System.out.println("parent class");
	}
}
class Child extends Parent{
	void methodDemo() {
		System.out.println("child class");
	}
}
public class FinalMethodDemo {

	public static void main(String[] args) {
       Child ch =new Child();
       ch.methodDemo();
	}

}
