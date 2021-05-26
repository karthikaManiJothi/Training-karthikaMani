package com.onebill.training.string;

public class StringConversion {

	public static void main(String[] args) {
         String str ="Onebill";
         
         //  converting String -StringBuffer
         StringBuffer sbr =new StringBuffer(str);
         sbr.reverse();
         System.out.println(sbr);
         
         // converting String -StringBuilder
         StringBuilder sbr1 =new StringBuilder(str);
         sbr1.append( "for future");
         System.out.println(sbr1);
         
         
         StringBuffer sb =new StringBuffer("demo");
         StringBuilder sb1 =new StringBuilder("demo1");

         
         // converting StringBuffer - String
         String sb_string =sb.toString();
         System.out.println(sb_string);
          
         // converting StringBuider - String
         String sb1_string =sb1.toString();
         System.out.println(sb1_string);
         
         //converting StringBuffer -StringBuilder bu converting it first to toString()
         StringBuilder sbb = new StringBuilder(sb_string);
	}

}
