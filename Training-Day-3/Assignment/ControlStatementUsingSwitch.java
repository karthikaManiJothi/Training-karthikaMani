package com.exc.cons;

import java.util.Scanner;

public class ControlStatementUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Selection\n2.Iteration\n3.Jump");
		System.out.print("Enter your choice:");
		int i =sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("1.if\n2.else\n3.else-if\n4.switch");
			System.out.print("Enter your choice:");
			int ch =sc.nextInt();
			System.out.println("Syntax:");
			switch(ch) {
			case 1:
				System.out.println("if(condition){  \n" + 
						"//code to be executed  \n" + 
						"}  ");break;
			case 2:
				System.out.println("if(condition){  \n" + 
						"//code if condition is true  \n" + 
						"}else{  \n" + 
						"//code if condition is false  \n" + 
						"}  ");break;
			case 3:
				System.out.println("if(condition1){  \n" + 
						"//code to be executed if condition1 is true  \n" + 
						"}else if(condition2){  \n" + 
						"//code to be executed if condition2 is true  \n" + 
						"}  ");break;
			case 4:
				System.out.println("switch( expression )\n" + 
						"{\n" + 
						"	case value-1:\n" + 
						"			Block-1;\n" + 
						"			Break;\n" + 
						"	case value-2:\n" + 
						"			Block-2;\n" + 
						"			Break;\n" + 
						"	case value-n:\n" + 
						"			Block-n;\n" + 
						"			Break;\n" + 
						"	default:\n" + 
						"			Block-1;\n" + 
						"			Break;\n" + 
						"}\n" + 
						"Statement-x; ");break;
			}break;
		case 2:
			System.out.println("1.for\n2.while\n3.do-while");
			System.out.print("Enter your choice:");
			int c =sc.nextInt();
			System.out.println("Syntax:");
			switch(c) {
			case 1:
				System.out.println("for(init;condition;incr/decr){  \n" + 
						"// code to be executed \n" + 
						"}");break;
			case 2:
				System.out.println("while(condition){  \n" + 
						"//code to be executed \n" + 
						"}");break;
			case 3:
				System.out.println("do{  \n" + 
						"//code to be executed  \n" + 
						"}while(condition); ");break;
		}break;
		case 3:
			System.out.println("1.break\n2.continue\n3.return");
			System.out.print("Enter your choice:");
			int jump =sc.nextInt();
			System.out.println("Syntax:");
			switch(jump) {
			case 1:
				System.out.println("jump-statement;    \n" + 
						"break;  ");break;
			case 2:
				System.out.println("continue keyword along with a semicolon\n" + 
						"\n" + 
						"continue;");break;
			case 3:
				System.out.println("used to exit from a method, with or without a value. \n default-syntax:return 0;");
	   }
	 }
  }
}
