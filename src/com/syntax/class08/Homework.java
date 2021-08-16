package com.syntax.class08;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// Ask user to pay for a candy 
				//*keep asking user to pay for candy until entered price is not equal to 3
				
				//* if entered value is more than 3 --> please give less money
				//* otherwise --> please give more money 
				
				//after user got a write amount print “Please enjoy your candy”/
				Scanner in=new Scanner(System.in);
				int price=3;
				
				
				do {
					System.out.println("please pay for candy");
					price=in.nextInt();
					if(price<3) {
						System.out.println("please give more money");
					}else if(price>3){
						System.out.println("Please give less money");
					}
					
				}while(price!=3);
				System.out.println("please enjoy your candy");
				
				
				

	}

}
