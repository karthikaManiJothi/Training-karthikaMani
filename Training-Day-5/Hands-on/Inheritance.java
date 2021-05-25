package com.onebill.handson.inherit;

class TwoDShape{     // Super class
	double width;
	double height;
	void ShowDimension() {
		System.out.println("Width and height are:"+ width+" "+height);
	}
}

class Triangle extends TwoDShape{  //Sub class
	String style;
	void showStyle() {
		System.out.println("Triangle is :"+style);
	}
	double calculateArea() {
		return width*height/2;
	}
}
public class Inheritance {

	public static void main(String[] args) {
     Triangle t1= new Triangle();
     Triangle t2 =new Triangle();
     System.out.println("         Traingle class 1");
     t1.width=10;
     t1.height=10;
     t1.style ="with border";
     t1.showStyle();
     t1.ShowDimension();
     System.out.println("Area :"+t1.calculateArea());
     System.out.println("         Traingle class 2");
     t2.width=5;
     t2.height=8;
     t2.style ="without border";
     t2.showStyle();
     t2.ShowDimension();
     System.out.println("Area :"+t2.calculateArea());
	}

}
