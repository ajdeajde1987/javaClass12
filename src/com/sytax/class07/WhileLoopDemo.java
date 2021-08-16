package com.sytax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// I want to print how are you 10 times?
		
		int i=0;
		
		while(i<=10) {
			System.out.println("How are you");
			i++;
			
		}
// i want to print numbers from 1 to 20
		System.out.println("I want to print numbers from 1 to 20");
		int a=1;
		while(a<=20) {
			System.out.println(a);
			a++;
			
		}
		System.out.println(" I want to print numbers from 100 to 110");
		int var=100;
		
		while(var<=110) {
			System.out.print(var+" "); // using without ln and + and "" makes everything print in one line with space
			var++;
			
		}
		System.out.println(" I want to print numbers 10 to 1");
		int num=10;
		
		while(num>=1) {
			System.out.println(num);
			num--;
			
		}
		System.out.println(" I want to print odd numbers from 1 to 20");
		
		int n=1;
		while(n<21) {
			System.out.println(n);
			n+=2;
			
		}
		n=1;
		
		System.out.println(" I want to print odd numbers from 1 to 20");
		while(n<21) {
			
			if(n%2!=0) {
				
			System.out.println(n);
			
			}
			n++;
			
		}
	}

}
