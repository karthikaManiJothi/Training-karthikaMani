package com.onebill.handson.inherit;

class Main{
	int number1;
	Main(int i){
		number1=i;
	    
	}
}

class Sub extends Main{
	int number1;
	Sub(int i){
		super(i);
		number1=i;
	}
}
public class Incompatability {

	public static void main(String[] args) {
     Main m1 =new Main(10);
     Main m2;
     Sub s1=new Sub(5);
     //m2=m1;
     //s1=m1;
	}

}
