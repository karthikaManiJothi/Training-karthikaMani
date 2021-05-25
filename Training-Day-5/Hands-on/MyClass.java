package com.onebill.handson.nestedclass;
// indirectly accessing the private inner class
class OuterDemo{
	int number;
	private class InnerDemo{
		void print() {
			System.out.println("This is inside inner class");
			}
	}
	void display() {
		InnerDemo innerdemo =new InnerDemo();
		innerdemo.print();
	}
}

public class MyClass {

	public static void main(String[] args) {
        OuterDemo outerdemo =new OuterDemo();
        outerdemo.display();
	}

}
