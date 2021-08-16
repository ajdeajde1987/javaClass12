package com.syntaxClass04;

import java.util.Scanner;

public class AnotherExample1111111 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//lets capture first and last name
		
		System.out.println("please enter your name");

		
		System.out.println("please enter your last name");
		String lastName=input.nextLine();
		
		System.out.println("please tell me country where are you from ");
		
		String country=input.nextLine();
		System.out.println("nice to meet you " +input+ "" + lastName+ "from" +country);
		
		/*
		 * next-- is used to capture A string value before space
		 * nextLine()----is used to capture String value (full line including space)
		 */
		
		

	}

}
