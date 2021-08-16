package com.sytax.class07;

public class TaskForLoop {

	public static void main(String[] args) {
		//print numbers from 1 to 100 in 1 line
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		//Print numbers from 100 to 1
		for(int i=100; i>=1; i--) {
			System.out.println(i);
			
		}
		//Print even numbers from 20 to 1 (2 ways)
		for(int i=20; i>=1; i-=2) {
			System.out.println(i);
			
			
		}
for(int i=20; i>=1; i--) {
	if(i%2==0) {
		System.out.println(i);
	}
}
		//Print odd numbers between 20 and 50 (2 ways)
for(int i=21; i<=50; i+=2) {
	System.out.println(i);
	
	
}
for(int i=20; i<=50; i++) {
	if(i %2!=0) {
		System.out.println(i);
	}
}


	}

}
