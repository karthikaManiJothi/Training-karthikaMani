package com.onebill.training.day10.handson;


interface MyInterface{
	void show();
}
public class LambdaExpressionDemo1 {

	public static void main(String[] args) {
		//lambdaExpression
      MyInterface ref =() -> {System.out.println("Inside show method...");};
      ref.show();
	}

}
