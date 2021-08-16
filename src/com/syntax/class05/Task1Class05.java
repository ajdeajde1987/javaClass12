package com.syntax.class05;

import java.util.Scanner;

public class Task1Class05 {

	public static void main(String[] args) {
		
		Scanner example= new Scanner(System.in);
		System.out.println("Please enter person heights in inches");
		int h=example.nextInt();
		
		if(h<60) {
			System.out.println("short");
		
		}else if(h>=60 && h<=72){
			System.out.print("medium");
			
		}else if (h>72) {
			System.out.println("tall");
			
		}

	

	}

}


