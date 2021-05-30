package com.onebill.training.day10.handson;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationsDemo {
  
	@Retention(RetentionPolicy.RUNTIME)
	
	public @interface Cars{
		Manufacturer[] value() default{};
	}
	
	@Manufacturer("Hyundai")
	@Manufacturer("Tata")
	@Manufacturer("BMW")
	@Manufacturer("Audi")
	public @interface Car{
		String value();
	}
	
	@Repeatable(value=Cars.class)
	public @interface Manufacturer{
		String value();
	}
	
	public static void main(String[] args) {
		
      Manufacturer[] a  =Car.class.getAnnotationsByType(Manufacturer.class);
      Cars cars = Car.class.getAnnotation(Cars.class);
      
      for(Manufacturer m : cars.value()) {
    	  System.out.println(m.value());
      }
	}

}
