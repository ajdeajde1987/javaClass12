package com.syntax.class10;

public class TwoDaArraysExamples {

	public static void main(String[] args) {
		String[][] food= {
				{"borsh","vareniki","draniki"},
				{"kebabs","palaw","mantu"},
				{"takos","burito","queso","salsa"},
				{"pasta","pizza","risotto","bread"}
				
				
		};
		
		System.out.println(food.length);
		
		
		
		
		System.out.println(food[2][1]);
		food[3][2]="cheese";
		System.out.println(food[3][2]);
		
		//how to get all values from 2D array
		System.out.println("=====");
		for(int i=0; i<food.length; i++) {//iterates over rows/array
			
			for(int j=0;j<food[i].length; j++){//iterate over columns/each element from an array
		
			System.out.println(food[i][j]);
			}
			
			
			

	}
	}
}

