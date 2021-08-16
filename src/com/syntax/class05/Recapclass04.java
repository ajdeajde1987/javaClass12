package com.syntax.class05;

import java.util.Scanner;

public class Recapclass04 {

	public static void main(String[] args) {
		
		String str;
		str="some value";
				Scanner example;
		example=new Scanner(System.in);
		
		int num=example.nextInt();
		System.out.println(num);
		
		char singleChar=example.next().charAt(0);
		System.out.println(singleChar);
		
		
		str=example.next();
		System.out.println(str);
		
		example.nextLine();
		str=example.nextLine();
		System.out.println(str);
		
		

	}

}
