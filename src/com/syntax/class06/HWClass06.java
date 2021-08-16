package com.syntax.class06;

import java.util.Scanner;

public class HWClass06 {

	public static void main(String[] args) {
		char grade;
		String student;
		System.out.println("Please provide your grade");
		
		Scanner in=new Scanner(System.in);
		grade=in.next().charAt(0);
		student=in.nextLine();
		switch (grade) {
		case 'A':
			student="excallent";
			break;
		case 'B':
			student="very good";
			break;
		case 'C':
			student="good";
			break;
		case 'D':
			student="not good";
			break;
		default:
			student="not acceptable";
				}
		System.out.println("Student entered grade "+grade+" which makes him/her a "+student+" student ");
		
		
		
		

	}

}
