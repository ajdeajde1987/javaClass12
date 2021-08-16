package com.syntax.class05;

import java.util.Scanner;

public class InitializeVariablesBetterWay {

	public static void main(String[] args) {
		
		/*
		 * ask user to enter 3 numbers
		 * find the largest
		 * 
		 */
        Scanner example;
        int num1,num2,num3, largest;
        
        example=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        num1=example.nextInt();
        num2=example.nextInt();
        num3=example.nextInt();
        
        if (num1>num2 && num1>num3) {
        	largest=num1;
        }else if(num2>num1 && num2>num3) {
        	largest=num2;
        	
        	
        }else {
        	largest=num3;
        	
        }
System.out.println("the largest number is " + largest);

//lets find out if largest is even or odd

if (largest%2==0) {
	System.out.println(largest + " number is even");
	
}else {
	System.out.println(largest + "number is odd");
	
}
	}

}

