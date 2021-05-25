package com.onebill.handson.nestedclass;

// Simple inner class -nested class demo

class Outer{
	class Inner{
		public void show() {
			System.out.println("Inside nested class");
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
      Outer.Inner inner =new Outer().new Inner();
      inner.show();
	}

}
