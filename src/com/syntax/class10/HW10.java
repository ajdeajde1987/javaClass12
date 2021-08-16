package com.syntax.class10;

public class HW10 {

	public static void main(String[] args) {
		//Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
		
		String[][]cars= {
				{"american"},
				{"german"},
					{"korean"},
					{"italian"}
		
	};
    for(int i=0;i<cars.length; i++) {
    	for(int c=0; c<cars[i].length; c++) {
    		System.out.println(cars[i][c]+" ");
    		
    	}
    	for(String[]model:cars) {
    		for(String a:model) {
    			System.out.println(a);
    		}
    	}
    		
    	}
    }
    
}
