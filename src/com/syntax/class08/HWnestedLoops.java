package com.syntax.class08;

public class HWnestedLoops {

	public static void main(String[] args) {
		// Using nested loops, create a car odometer that will print mileage from 00000 till 99999
		
		for(int i=0; i<=9; i++) {
			for(int a=0; a<=9; a++) {
				for(int b=0; b<=9; b++) {
					for(int c=0; c<=9; c++) {
						for	(int d=0; d<=9; d++){
							System.out.println(i+" "+a+" "+b+" "+c+" "+d);
							
						}
					}
				}
			}
		}

	}

}
