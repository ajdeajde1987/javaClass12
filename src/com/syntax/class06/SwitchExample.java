package com.syntax.class06;

public class SwitchExample {

	public static void main(String[] args) {
		
		char gender='M';
		
		switch(gender) {
		
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Gender is unknown");
			
		}
System.out.println("-----LIMITATIONS------");
//boolean boo=true;
//switch(boo){
//float
//double
//long// CAN NOT WORK WITH THESE//
	}

}
