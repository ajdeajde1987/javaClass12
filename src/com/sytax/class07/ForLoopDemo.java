package com.sytax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// i want to say hello 5 times
		// for(initialization;condition;increment/decrement;){
		// code to be repeated
		for (int i = 1; i <= 5; i++) {
			System.out.println("heloo");
		}
		System.out.println("we want to print numbers from 1 to 10");
		//for(start; end; increment/decrement)
		
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("want to print numbers 20 to 10");
		
		for(int i=20; i>=10; i--) {
			System.out.print(i+" ");
		}
		System.out.println("want to print even numbers from 10 to 100");
		
		for(int i=10; i<=100; i+=2) {
			System.out.print(i+ " ");
		}
		System.out.println("want to print even numbers from 10 to 100");//with if statement
		
		for(int i=10; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
				
			}
		}
		for (int i=1; i<=50; i+=10) {
			System.out.println(i);
		}
	}

}
