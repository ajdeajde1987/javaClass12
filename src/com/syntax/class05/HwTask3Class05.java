package com.syntax.class05;

import java.util.Scanner;

public class HwTask3Class05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	System.out.println("Find the largest number")	;
	
		int num1,num2,num3;
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " is the largest number");
			
			
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " is the largest number");
					
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3 + " Is the largest number");
			
		}
		
		
		
		

	}

}
