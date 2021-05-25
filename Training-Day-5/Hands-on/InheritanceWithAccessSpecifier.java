package com.onebill.handson.inherit;

class Inherit1{
	int i=10;
	void method1() {
		System.out.println("value of i in superclass"+i);
	}
}

class Inherit2 extends Inherit1{
	void method2() {
		System.out.println("value of i in subclass is"+(i*10));
	}
}
public class InheritanceWithAccessSpecifier {

	public static void main(String[] args) {
     Inherit2 inherit =new Inherit2();
     inherit.method2();
	}

}
