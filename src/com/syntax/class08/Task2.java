package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String answer;
		
		do {
			System.out.println("Did you apply for credit card");
			answer=in.nextLine();
			if(answer.equals("yes")) {
				break;
			}
			
			
		}while(!answer.equals("yes"));
		
		System.out.println("you are good");
		

	}

}
