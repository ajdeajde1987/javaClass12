package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		int start, end, evenSum=0, oddSum=0;
		System.out.println("Please enter starting integer");
		start=scan.nextInt();
		System.out.println("please enter ending integer");
		end=scan.nextInt();
		
		for( int i=start; i<=end; i++) {
			
			if(i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
				
			}
		
		
		
		
		}
		
		System.out.println("Sum of even numbers from range "+start+" till "+end+" equals to "+evenSum);
		System.out.println("Sum of even numbers from range "+start+" till "+end+" equals to "+oddSum);
	}
	}


