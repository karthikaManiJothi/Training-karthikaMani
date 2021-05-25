package com.onebill.handson.exce;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("drawing rectangle ");
		
	}
}
	class Circle extends Shape{
		@Override
		void draw() {
			System.out.println("drawing circle ");
			
		}	
}


public class AbstractClasses {

	public static void main(String[] args) {
		Shape s1 =new Rectangle();
		s1.draw();
		Shape s2 =new Circle();
		s2.draw();
	}

}
