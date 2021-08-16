package com.sytax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
		// i want to print multiplication table
		// 1X1=1;
		// 1X2=2;
		// 1X10=10;

		int num = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + "=" + num * i);
		}
		System.out.println("what is the output");
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
		System.out.println("What is the output");
		
		sum=0;
		for(int i=0; i<=40; i+=10) {
			sum+=i;//short for line 19
			
		}
		System.out.println(sum);
		System.out.println("what is the output");
		
		int total=1;
		for(int i=1; i<5; i++) {
			total*=i;
			
		}
		System.out.println(total);
		//hw Please find sum of even and odd numbers from 1 to 100
		//
		//hw ask user to pay for a candy
		//keep asking user to pay for candy until entered price is not equal to 3
		
		//if entered value is more then 3--please give less money
		//otherwise----please give more money
		
		//after user got it write amount print ----
		
	}

}
