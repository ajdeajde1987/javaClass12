package com.syntaxClass04;

import java.util.Scanner;

public class TemperatureTask4 {

	public static void main(String[] args) {
	
        Scanner program=new Scanner(System.in);
		
		System.out.println("what is the city");
		
		String name=program.next();
		System.out.println("what is the temperature in the city");
		
        int temp=program.nextInt();
        int cell=(temp-32)*5/9;
        
        System.out.println(" The Temperature IN" + name + " is " + cell + "celcious");
        
        
}
}