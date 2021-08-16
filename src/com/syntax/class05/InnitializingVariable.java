package com.syntax.class05;

import java.util.Scanner;

public class InnitializingVariable {

	public static void main(String[] args) {
		
		/*
		 * ask user to enter 3 numbers
		 * find the largest
		 * 
		 */
        Scanner example;
        int num1,num2,num3;
        
        example=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        num1=example.nextInt();
        num2=example.nextInt();
        num3=example.nextInt();
        
        if(num1==num2 && num2==num3) {
        	System.out.println("All numbers are equal");
        }else {	
        
        if(num1>=num2 && num1>=num3) {
        	System.out.println(num1+ " is the largest number ");
        	
        }else if(num2>=num1 && num2>=num3) {
        	System.out.print(num2 + " is the largest number");
        	
        }else if(num3>=num1 && num3>=num2) {
        	System.out.println(num3 + " is the largest number");
        	
        }
        	
        }
        
        
        
	}

}
