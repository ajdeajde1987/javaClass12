package com.syntax.class09;

public class HomeworkdArraysTask3LargestNumber {

	public static void main(String[] args) {
		
		
		//find the largest number
		
		int[]num= {10,20,100,50,222};
		int largest=num[0];
		
		for(int i=1; i<num.length; i++) {
			
			if(num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.println(largest);
		System.out.println("=============enhanced for loop=======");
		largest=num[0];
		for(int n:num) {
			if(n>largest) {
				largest=n;
			}
		}
		System.out.println(largest);

	}

}
