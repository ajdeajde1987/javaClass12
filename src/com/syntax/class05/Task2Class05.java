package com.syntax.class05;

import java.util.Scanner;

public class Task2Class05 {

	public static void main(String[] args) {
		
		Scanner example=new Scanner(System.in);
		
		System.out.print("Enter day 1 from 7");
		int day=example.nextInt();
		
		if(day>=1 && (day <6)){
			System.out.println("it is a week day");
			
			
		}else if (day==6 || (day<=7)) {
			System.out.println("it is weekend");
			
		}else {
			System.out.println("invalid day");
			
	}
		}

	}


