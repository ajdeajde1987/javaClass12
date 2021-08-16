package com.sytax.class07;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n1, n2;
		String operator;
		int result = 0;
		System.out.println("Please enter two numbers");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		System.out.println("Please enter the operators you want to use (+,-,*,/)");
		operator= scan.next();
		
		if (operator.equals("+")) {
			result = n1 + n2;
		} else if (operator.equals("-")) {
			result = n1 - n2;
		} else if (operator.equals("*")) {
			result = n1 * n2;
		} else if (operator.equals("/")) {
			result = n1 / n2;
		}
		System.out.println("Based on your entry with the operator ("+operator+") Your result is "+result);
		
		
	}

	}


