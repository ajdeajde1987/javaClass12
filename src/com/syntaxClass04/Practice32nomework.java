package com.syntaxClass04;

import java.util.Scanner;

public class Practice32nomework {

	public static void main(String[] args) {
		Scanner example=new Scanner(System.in);
		
		char gender=example.next().charAt(0);
		String age=example.nextLine();
		
		System.out.println("Please enter your gender:F or M");
		System.out.println("Please enter your age");
		 
		
		if(age > 25){
			
			if(gender=='F') {
				System.out.println("Woman");
				
				
			}else {
				System.out.println("Man");
				
			}
		}
		
		
		
		
		
		
		

	}

}
