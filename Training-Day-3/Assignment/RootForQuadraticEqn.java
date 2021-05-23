package com.exc.cons;
import static java.lang.Math.*;
import java.util.Scanner;

public class RootForQuadraticEqn {

	public static void main(String[] args) {
		double root1,root2;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a:");
		int a =sc.nextInt();
		System.out.print("Enter b:");
		int b =sc.nextInt();
		System.out.print("Enter c:");
		int c =sc.nextInt();
		double numerator = pow(b,2) - 4 * a * c;
	    if (numerator> 0) {

	      root1 = (-b + sqrt(numerator)) / (2 * a);
	      root2 = (-b - sqrt(numerator)) / (2 * a);
	      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	    }
	    else if (numerator== 0) {
	        root1 = root2 = -b / (2 * a);
	        System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	      }
	    else {
	    	double real = -b / (2 * a);
	        double imaginary = sqrt(-numerator) / (2 * a);
	        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	        System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	    }
	}

}
