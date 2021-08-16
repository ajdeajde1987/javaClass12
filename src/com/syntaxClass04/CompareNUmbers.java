package com.syntaxClass04;

import java.util.Scanner;

public class CompareNUmbers {

	public static void main(String[] args) {
		// compare two numbers and see which 0ne is the largest
		
		Scanner data=new Scanner(System.in);
		
		System.out.println("please enter firat number");
		int num1=data.nextInt();
		
		System.out.println("please enter a second number");
		int num2=data.nextInt();
		
		if(num1>num2) {
			
			System.out.println(num1+ " is larger then " +num2);
			
		}else if (num1<num2) {
			System.out.println(num1 + " is smaller then" +num2);
		}else {
			System.out.println(num1+ " is equal to " + num2);
			
		}
		
		

	}

}
