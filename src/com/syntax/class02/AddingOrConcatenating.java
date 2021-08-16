package com.syntax.class02;

public class AddingOrConcatenating {

	public static void main(String[] args) {
		// 
		String a="hello";
		String b="world";
		int c=10;
		int d=20;
		System.out.println(c+d+a+b);//30 helloWorld
		System.out.println(a+c+b+d);//hello10wprld20
		System.out.println(a+(c+d)+b);//hello30world
		System.out.println(a+c+d+b);//hello1020world
		
		System.out.println(a+b+c+d);
		
		String combined=a+b+c+d;
		
		System.out.println(combined);
		char grade='A';
		
		String str="student";
		
		String newString=grade+str;
		
		System.out.println(newString);
		
		

	}

}
