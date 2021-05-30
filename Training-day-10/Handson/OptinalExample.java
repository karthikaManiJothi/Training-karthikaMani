package com.onebill.training.day10.handson;

import java.util.Optional;

public class OptinalExample {

	public static void main(String[] args) {
		
        String[] str =new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[4]);
        
        if(checkNull.isPresent()) {
        	System.out.println(str[4]);
        }
        else {
        	System.out.println("String is empty");
        }
	}

}
