package com.syntax.class06;

import java.util.Scanner;

public class HomeWorknumber3CXlass06 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
	String calculator;
	
     int num1,num2;
     int result=0;
     
	String operator;
     System.out.println("Please enter two numbers");
     num1=in.nextInt();
     num2=in.nextInt();
     System.out.println("please enter the operator(+,-,*,/");
     
    operator=in.next();
    
     switch (operator) {
     case "+":
    	result=num1+num2;
    	break;
     case "-":
    	 result=num1-num2;
    	 break;
     case "/":
    	 result=num1/num2;
    	 break;
     case "*":
    	 result=num1*num2;
    	 break;
    	 default:
    		 result=0;
    		 
    		 
    	  }
     if(result!=0) {
    	 
     
     System.out.println("The result is " + result );
     }
	}

}
