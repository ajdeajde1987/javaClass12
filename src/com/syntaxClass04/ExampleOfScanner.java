package com.syntaxClass04;



//shortcut to import: ctrl+shift+o
import java.util.Scanner;


public class ExampleOfScanner {

	public static void main(String[] args) {
		
	
		
		
		
		Scanner scan=new Scanner(System.in);//creating scanner
		System.out.println("please enter you name");
		
		
		//capture String values and we stored inside variable value
		String name=scan.nextLine();//capturing string value
		
		System.out.println("Hello" + name);
		
		//capture integer value
		System.out.println("please enter youe age");
		int age=scan.nextInt();
		System.out.println(name + "is" +age+"year old");
		
		
	

		
	}

}
