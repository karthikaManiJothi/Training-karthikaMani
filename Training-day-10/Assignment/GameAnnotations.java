package com.onebill.training.day10.exec;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



public class GameAnnotations {
	
	//Declaring container for repeatable annotation type
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Games{
		GameTypeUsingBalls[]  value() default{};
	}
    
	//repeating annotation
	@GameTypeUsingBalls("Basket Ball")
	@GameTypeUsingBalls("Volley Ball")
	@GameTypeUsingBalls("Foot Ball")
	@GameTypeUsingBalls("Hand Ball")
	public @interface Game{
		String value();
	}
	
	//Declaring repeatable annotation type
	@Repeatable(value=Games.class)
	public @interface GameTypeUsingBalls{
		String value();
	}
	
	public static void main(String[] args) {
      
		GameTypeUsingBalls[] gm = Game.class.getAnnotationsByType(GameTypeUsingBalls.class);
		Games gt = Game.class.getAnnotation(Games.class);
		
		for(GameTypeUsingBalls gmt : gt.value()) {
			System.out.println(gmt.value());
		}
	}

}
