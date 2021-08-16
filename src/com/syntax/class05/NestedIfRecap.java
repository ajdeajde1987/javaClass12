package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		/*
		 * 
		 * write a program to ask if a user got a visa
		 * if user got a visa ask how long is visa for
		 * if visa is less more 1 year-- cool
		 * if less---you will habe to go back in 1 year ND TO APPLY AGAIN
		 */
//first declare the variables
		Scanner scan;
		String visa;
		int years;
		
	scan=new Scanner(System.in)	;
	System.out.println("Hey,did you get your visa");
	
	visa=scan.next();
	
	if(visa.equals("yes")) {
		System.out.println("Congradulations, how long is your visa for");
		
		years=scan.nextInt();
		
		if(years>1) {
			System.out.println("That is awesome");
			
		}else {
			System.out.println("you will have to go back in 1 year and to apply again");
			
		}
	}
	
	
		
		
		
	}
	

}
