package com.onebill.assignment.nonstaticnestedclasses;

class StaticOuterClass{  
	  static int num=10;  
	  static class StaticInnerClass{  
	   void display(){
		   System.out.println("Inside Static nestedClass");
		   System.out.println("Static class have static members like num:"+num);
		   }  
	  }  
}
	  
public class StaticNestedClass {

	public static void main(String[] args) {
     StaticOuterClass.StaticInnerClass obj=new StaticOuterClass.StaticInnerClass();
     obj.display();
	}

}
