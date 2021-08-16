package com.sytax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		
        System.out.println("------while-----");
		int i = 1;
		while (i >=3) {
			System.out.println("heloo");
			i++;
		}
		
		System.out.println("------do while-------");
		
		int j=1;
		
		do {
			System.out.println("hello");
			j++;
		}while(j>=3);
		
		System.out.println("-----------");
		//print numbers from 1 till 10 using do while loop
		
		int n=1;
		do {
			System.out.println(n);
			n++;
		}while(n<=10);

	}

}
