package com.onebill.handson.staticexec;

public class StaticBlockDemo {
    static {
    	System.out.println("invoking static method");
    	System.exit(0);
    }
	public static void main(String[] args) {
      System.out.println("main method");
	}

}
