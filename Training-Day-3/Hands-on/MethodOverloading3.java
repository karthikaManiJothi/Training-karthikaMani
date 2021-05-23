package com.exc.cons;

class Methodoverld{
	public void display(int n) {
		System.out.println("int :"+n);
	}
	public void display(int n, int m) {
		System.out.println("int :"+n+" "+m);
	}
}

public class MethodOverloading3 {

	public static void main(String[] args) {
		System.out.println("MethodOverloading - Variation in number of parameters");
		Methodoverld m1 =new Methodoverld();
		m1.display(1);
		m1.display(1, 2);
	}

}
