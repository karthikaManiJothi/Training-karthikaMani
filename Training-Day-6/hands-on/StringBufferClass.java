package com.onebill.training.string;


public class StringBufferClass{
	public static void concat1(String s1) {
		s1=s1+" for freshers";
	}
	public static void concat2(StringBuffer s2) {
		s2.append(" for freshers");
	}
	public static void concat3(StringBuilder s3) {
		s3.append(" for freshers");
	}

	public static void main(String[] args) {
		//String s1 ="Training";
		//concat1(s1);
		//System.out.println("String :"+s1);
		//StringBuffer s1=new StringBuffer("Training");
		//concat2(s1);
		//System.out.println("String Buffer: "+s1);
		StringBuilder s1=new StringBuilder("Training");
		concat3(s1);
		System.out.println("String Builder: "+s1);
	}

}
;