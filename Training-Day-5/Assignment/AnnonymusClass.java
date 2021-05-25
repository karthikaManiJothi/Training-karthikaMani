package com.onebill.assignment.nonstaticnestedclasses;

abstract class AnonymousAbstractInnerClass {
	     abstract void displayAbstractmethod();
	}


	
public class AnnonymusClass {

	public static void main(String[] args) {
		AnonymousAbstractInnerClass abstractinner = new AnonymousAbstractInnerClass() {
			@Override
			void displayAbstractmethod() {
				System.out.println("Anonymous abstract inner class");			
			}
			};
			abstractinner.displayAbstractmethod();	
		}
	}


