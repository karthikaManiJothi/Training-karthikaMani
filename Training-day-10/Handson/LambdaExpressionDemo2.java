package com.onebill.training.day10.handson;

import java.time.LocalDate;

interface LambdaInterface {
	int process();
	
	static LocalDate nowDate() {
		LocalDate today = LocalDate.now();
		return today ;
	}
	
	default int calculate(int a,int b) {
		return a+b;
	}
 }

public class LambdaExpressionDemo2 {

	 public static void main(String[] args) {
		 
     LambdaInterface ref =() ->100;
     System.out.println(ref.process());
     System.out.println("Sum:"+ref.calculate(10, 5));
     System.out.println("Today:"+LambdaInterface.nowDate());
     
	}

}
