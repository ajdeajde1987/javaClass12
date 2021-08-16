package com.syntax.classReview03;

public class LogicalOperator2 {

	public static void main(String[] args) {
	
//		if a number is from 0to 100 print number is in range
//		else print number is out of range
		
int number=10000;

if (number>=0) {
	if(number<=100) {
		System.out.println("number is in range");
	}else {
        System.out.println("number is out of range");
}
	}else {
		System.out.println("number is out of range");
	}
//logical
if(number>=0 && number<=100) {
	System.out.println("number is in range");
}else {
	System.out.println("number is out of range");
}
}
}