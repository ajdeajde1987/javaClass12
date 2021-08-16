package com.syntax.class06;

import java.util.Scanner;

public class HMRecapNumber3 {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
	System.out.println("Find the largest number")	;
	
		int num1,num2,num3,largest;
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(!(num1==num2 && num2==num3)) {
			if(num1>num2) { //assuming num1 is larger then num2
				if(num1>num3) {
					largest=num1;
					
				}else {//looking that num3 is larger then num1 num3>num1
					largest=num3;
					
				}
			}else { //num2 is larger then num1 num2>num1
				if(num2>num3) {
					largest=num2;
					
				}else {//looking into num3 is larger then num2 num3>num2
					largest=num3;
					
				}
			}
			System.out.println("The largest number is " + largest);
			
		}

	}

}
