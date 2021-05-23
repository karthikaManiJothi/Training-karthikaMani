package com.exc.cons;

import java.util.Scanner;

class Box{
	int length,width,height;
	
    public Box() {
		this.length = 1;
		this.width  = 1;
		this.height = 1;
	}

    public Box(int length) {
		this.length = length;
	}
	public Box(int length, int width) {
		this();
		this.length = length;
		this.width = width;
	}
	
    public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int volumeCalculation() {
		return this.length*this.width*this.height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Box b1 =new Box();
		System.out.println(b1.toString());
		System.out.println("volume with DefaultValue:"+b1.volumeCalculation());
		System.out.println("Enter length:");
		int length =sc.nextInt();
		Box b2 =new Box(length);
		System.out.println(b2.toString());
		System.out.println("volume with one inputValue:"+b2.volumeCalculation());
		System.out.println("Enter length:");
		int n1=sc.nextInt();
		System.out.println("Enter width:");
		int n2=sc.nextInt();
		Box b3 =new Box(n1,n2);
		System.out.println(b3.toString());
		System.out.println("volume with 2 inputValue:"+b3.volumeCalculation());
		System.out.println("Enter length:");
		int num1 =sc.nextInt();
		System.out.println("Enter width:");
		int num2 =sc.nextInt();
		System.out.println("Enter height:");
		int num3 =sc.nextInt();
		Box b4 =new Box(num1,num2,num3);
		System.out.println(b4.toString());
		System.out.println("volume with 3 inputValue:"+b4.volumeCalculation());
		

	}

}
