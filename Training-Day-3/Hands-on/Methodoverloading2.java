package com.exc.cons;

class Methodoverloaded{
	public void display(int n,char m) {
		System.out.println("int :"+n+" char :"+m);
	}
	public void display(char n, int m) {
		System.out.println("char :"+n+" int :"+m);
	}
}

public class Methodoverloading2 {
    public static void main(String[] args) {
    	System.out.println("MethodOverloading - Variation in order of parameters");
		Methodoverloaded m1 =new Methodoverloaded();
		m1.display(1, 'a');
		m1.display('a', 2);
	}

}
