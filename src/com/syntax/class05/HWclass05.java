package com.syntax.class05;

import java.util.Scanner;

public class HWclass05 {

	public static void main(String[] args) {
		Scanner example=new Scanner(System.in);
		
		example=new Scanner(System.in);
	
		
		int quiz,midTerm,finalScore,average;
		char grade ;
		
		System.out.println("Enter 3 scores: quiz,midTerm and finalScore");
		
		quiz=example.nextInt();
		midTerm=example.nextInt();
		finalScore=example.nextInt();
		average=(quiz+midTerm+finalScore)/3;
		
		if(average>=90) {
			grade='A';
			
		}else if(average>=70 && average<90) {
			grade='B';
			
		}else if(average>=50 && average<70) {
			grade='C';
					
		}else if(average <50) {
			grade='F';
					
		
		
		System.out.println("With average score=" +average+ " your grade is " +grade);
		
		}	
		

	}

}
