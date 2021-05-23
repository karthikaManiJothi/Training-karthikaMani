import java.util.Scanner;

public class UsingScannerClass {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		System.out.print("Enter gender:");
		char gender = sc.next().charAt(0);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		System.out.print("Enter your MobileNo:");
		Long mobileNo = sc.nextLong();
		System.out.print("Enter your salary:");
		double salary =sc.nextDouble();
		
		System.out.println("Name :"+name);
		System.out.println("Gender :"+ gender);
		System.out.println("Age:"+ age);
		System.out.println("Mobile No :"+mobileNo);
		System.out.println("Salary :"+ salary);
		sc.close();
		
	}

}
