package com.syntax.class10;

public class HW10a {

	public static void main(String[] args) {
	//Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops

		String[][]grocery= {
				{"potato","tomato","carrot"},
				{"banana","kiwi","apple","blueberry"},
				{"milk","cheese","sour cream","jogurt","heavy cream"},
				{"chocolate","ice cream","cookies","cheesecake"}
				
				
				
		};
		for(int i=0; i<grocery.length; i++) {
			for(int a=0; a<grocery[i].length; a++) {
				System.out.println(grocery[i][a]+" ");
				System.out.println();
				
				
			}
			System.out.println("============");
			for(String[]list:grocery) {
				for(String l:list) {
					System.out.println(l+" ");
				}
			
				
			}
		}
	}

}
