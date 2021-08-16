package com.sytax.class07;

import java.util.Scanner;

public class MoreWhileLoop {

	public static void main(String[] args) {
		//
//
		//ask name and age from a used 3 times
		//print name+age
		
		Scanner scan;
		String name;
		int age;
		
		scan=new Scanner (System.in);
		
		int i=1;
		while(i<=3) {
			
		
		
		
		System.out.println("Please enter your name");
		name=scan.next();
		
		System.out.println(name + " please enter your age");
		age=scan.nextInt();
		
		System.out.println(name+ " is "+age+ " years old");
		i++;
		}

	}

}
