package com.syntax03;

public class IfElseIfStatement {

	public static void main(String[] args) {
		/*
		 * whati si the larger number
		 */
	System.out.println("start of my code...");	
	
		int num1=20;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+ " is larger then "+ num2);
			
		}else if(num1<num2) {
			
			System.out.println(num1+" is smaller then " +num2);
		}else {
			System.out.println(num1+" is equal to"+ num2);
		}
		
		/*
		 * 
		 * declare a variable day and then based on the day value provide output sucj as
		 * if day is equal to 1---today is monday
		 * if day is equal to 2--- today is tuesday
		 * 
		 
		 */
		
		int day=70;
		
		if (day==1) {
			System.out.println("today is monday");
		}else if  (day==2) {
			System.out.println("today is tuesday");
		}else if (day==3) {
			System.out.println("today is wednesday");
		}else if (day==4) {
			System.out.println("today is thursday");
			
					
		}else if (day==5) {
			System.out.println("today is friday");
		}else if (day==6) {
			System.out.println("today is saturday");
		}else if (day==7) {
			System.out.println("today is sunday");
		}else {
			System.out.println(day+ " is invalid.please use day from 1-7");
		}
				
 System.out.println("end of my code...");
	}

}
