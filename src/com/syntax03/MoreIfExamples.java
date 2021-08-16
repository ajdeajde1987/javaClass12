package com.syntax03;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class MoreIfExamples {

	public static void main(String[] args) {
		double a=20;
		double b=20;
		
		if (a==b ) {//condition must be a boolean value
			
			System.out.println("numbers are equal");
			
			System.out.println("my numbers are twins");
		}else {
			System.out.println("numbers are not equal");
			System.out.println("numbers are not twins");
			System.out.println("i am else block code");
		}
		
		System.out.println("_________________________________");
		
		
		//if it is a break time--- i will get a coffee otherwise i will focus on the class
		
		boolean isBreakTime=false;
		
		if(isBreakTime==true)//longer way
			//if(isBreakTime)//shorter way
		{
			System.out.println("i am getting my coffee");
			
		}else {
			System.out.println("i am focusing on the class");
		}
		
/*
 * if you are hungry----i will go eat
 * otherwise: i will have a tea
 * 
 */
		
		boolean isHungry=true;
		
		if(isHungry) {
			System.out.println("i will go eat");
			
		}else {
			System.out.println("i will have a tea");
			
			int num1=20;
			int num2=20;
			
			if (num1>num2) {
				
				System.out.println("num1 is larger then num2");
				
			}else {
				System.out.println("num2 is larger then num1");
			}
		}
	}
}
		
	


