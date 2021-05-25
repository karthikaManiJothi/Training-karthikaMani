package com.onebill.assignment.nonstaticnestedclasses;

import java.util.Scanner;

class OuterClass {
	   void dislayNumber(int num) {
	      class InnerClass {  //inner class inside a method
	         public void print() {
	            System.out.println("This is method inner class "+num);
	         }
	      }
	      InnerClass inner = new InnerClass();
	      inner.print();
	   }
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
       OuterClass outerclass =new OuterClass();
       outerclass.dislayNumber(10);
       sc.close();
	}
}


