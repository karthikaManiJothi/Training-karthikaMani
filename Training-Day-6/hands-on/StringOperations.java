package com.onebill.training.string;

public class StringOperations {

	public static void main(String[] args) {
       String s1="Java ";
       String s2 ="easy to lean";
       System.out.println(s1.length());
       System.out.println("position at 3rd:"+s1.charAt(2));
       System.out.println("Index of easy:"+s2.indexOf("easy"));
       System.out.println("Concatenated String:"+s1.concat(s2));
       boolean check ="java".equalsIgnoreCase("java");
       System.out.println(check);
       String s3 ="           Learn share learn";
       System.out.println(s3.trim());
       System.out.println(s2.substring(5));
       
	}

}
