package com.onebill.training.day10.exec;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*@FunctionalInterface         
  Consumer Interface has only one method - accept();
  accept() - accepts a single input argument 
*/

/*class MyClass implements Consumer<Integer>{
                                                //implementing consumer interface in a class
	@Override
	public void accept(Integer t) {
      System.out.println(t);		
	}
}*/

public class ConsumerDemo {

	public static void main(String[] args) {
		
    List<Integer> list =Arrays.asList(10,20,30,40,50);
    
    /*Consumer<Integer> cons =new Consumer<Integer>() {   // Anonymous class
		@Override
		public void accept(Integer t) {
            System.out.println(t);			
		}
	};*/
    
    Consumer<Integer> cons = i -> System.out.println(i*2);  // Using Lambda Expressions
    list.forEach(cons);
	}

}
