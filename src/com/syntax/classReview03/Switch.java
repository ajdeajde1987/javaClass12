package com.syntax.classReview03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//
		System.out.println("enter two numbers");
		Scanner scanner = new Scanner(System.in);
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();

		System.out.println("enter the operation");
		char operation = scanner.next().charAt(0);

		if (operation == '+') {
			System.out.println("number1+number2");
		} else if (operation == '-') {
			System.out.println("number1-number2");
		} else if (operation == '*') {
			System.out.println("number1*number2");
		} else if (operation == '/') {
			System.out.println("number1/number2");
		} else {
			System.out.println("operation not supported");
		}
//switch

		switch (operation) {
		case '+':
			System.out.println("number1+number2");
			break;

		case '-':
			System.out.println("number1-number2");
			break;
		case '*':
			System.out.println("number1*number2");
			break;
		case '/':
			System.out.println("number1/number2");
			break;
		default:
			System.out.println("operation not supported");

		}

	}

}
