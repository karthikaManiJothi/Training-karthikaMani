package com.exc.cons;

class Methodoverload{
	public void display(int n,int m) {
		System.out.println("int dataType:"+n+" "+m);
	}
	public void display(char a, char b) {
		System.out.println("char dataType:"+a+" "+b);
	}
}

public class MethodOverloading1 {
  public static void main(String[] args) {
	   System.out.println("   MethodOverloading - Variation in datatypes");
		Methodoverload m1 =new Methodoverload();
		m1.display(1, 2);
		m1.display('x','y');
    
	}

}
