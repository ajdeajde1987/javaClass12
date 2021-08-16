package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
	
		
		for (int i=0; i<=3; i++) {
			
			if (i==1) {
				continue;
				
			}
			System.out.println("I am inside the loop");
			System.out.println(i);
		}
		
		//i want to print all numbers from 1 till 10 except 5 and 9
		
		for (int i=1; i<=10; i++) {
			
			if(i==5 || i==9) {
				continue;
			}
			
			System.out.print(i+" ");//using this to print everything in one line with space
		}

	}

}
