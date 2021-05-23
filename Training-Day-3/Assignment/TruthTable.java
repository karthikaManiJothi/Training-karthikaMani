package com.exc.cons;

public class TruthTable {

	public static void main(String[] args) {
	   boolean p1=true,q1=true;
	   boolean p2=true,q2=false;
	   boolean p3=false,q3=true;
	   boolean p4=false,q4=false;
	   
	   boolean p1_and_q1 =p1&&q1;
	   boolean p2_and_q2 =p2&&q2;
	   boolean p3_and_q3 =p3&&q3;
	   boolean p4_and_q4 =p4&&q4;
	   
	   boolean p1_or_q1 =p1||q1;
	   boolean p2_or_q2 =p2||q2;
	   boolean p3_or_q3 =p3||q3;
	   boolean p4_or_q4 =p4||q4;
	   
	   boolean p1_xor_q1 =p1^q1;
	   boolean p2_xor_q2 =p2^q2;
	   boolean p3_xor_q3 =p3^q3;
	   boolean p4_xor_q4 =p4^q4;
	   System.out.println("            Truth Table");
	   System.out.println("-------------------------------------");
       System.out.println("   p   |   q   | p&&q |  p||q | p^q");
       System.out.println("true   | true  |"+p1_and_q1+"  | "+ p1_or_q1 +"  | "+p1_xor_q1);
       System.out.println("true   | false |"+p2_and_q2+" | "+ p2_or_q2 +"  | "+p2_xor_q2);
       System.out.println("false  | true  |"+p3_and_q3+" | "+ p3_or_q3 +"  | "+p3_xor_q3);
       System.out.println("false  | false |"+p4_and_q4+" | "+ p4_or_q4 +" | "+p4_xor_q4);
       System.out.println("-------------------------------------");
       }

}
