package com.syntax.class09;

public class ForEnhancedLoop {

	public static void main(String[] args) {
		char[] grades= {'a','b','c','d','e','f','g'};
		
		for(char grade:grades) {
			System.out.println(grade+" ");
		}
		int []numbers= {100,20,67,45,90,23};
		//regular for loop
		for(int a=0; a<numbers.length; a++) {
			System.out.println(numbers[a]);
			
		}
		//enhanced for loop
		for(int number:numbers) {
			System.out.println(number);
		}
		
		System.out.println("i want to print values backwards");
		
		for(int i=grades.length-1; i>=0; i--) {
			
			System.out.println(grades[i]);
			System.out.println(" ");
		}
		


	}

}
