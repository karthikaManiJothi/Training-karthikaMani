package com.onebill.training.moduletest.musicapp;

import java.util.Scanner;

public class DatabaseOperation {
	
	Scanner sc =new Scanner(System.in);
	
	public void dbOperation() {
		
		
		System.out.println("1.Add Song\n2.Edit Song\n3.Delete Existing Song");
		System.out.println("Enter your choice:");
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			DatabaseInsertionClass insert =new DatabaseInsertionClass();
			insert.adding();
			break;
		case 2:
			DatadaseEditClass edit =new DatadaseEditClass();
			edit.editing();
			break;
		case 3:
			DeleteDatabaseClass delete =new DeleteDatabaseClass();
			delete.deleting();
			break;
		default:
				System.out.println("Wrong choice!...Please Try again");
				System.exit(0);
		}
	}

}
