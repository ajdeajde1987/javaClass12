package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		//using Scanner create an array of integer elements;
		
		int[]array= {13};
		System.out.println(array.length);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want to store inside an array");
		int size=scan.nextInt();
		
		int[] numbers=new int[size];
		
		for(int i=0; i<size;i++) {
			numbers[i]=scan.nextInt();
		}
		System.out.println("Display all elements from an array");
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		

	}

}
