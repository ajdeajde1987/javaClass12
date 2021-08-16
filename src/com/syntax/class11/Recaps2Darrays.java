package com.syntax.class11;

public class Recaps2Darrays {

	public static void main(String[] args) {
		
		int [][] twoDAarray= { {10,20}, {1,2,3}, {100,200,300,400} };
		
		int howManyArrays=twoDAarray.length;
		System.out.println(howManyArrays);//3 counts columns, and we have 3 columns
		
		System.out.println(twoDAarray[0].length);// how many in each we have, its 0 meaning how many in first one
		
		for(int []arr:twoDAarray) {//arr is a nested array
			for(int num:arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		
		for(int r=0; r<twoDAarray.length; r++) {
			
			for(int c=0; c<twoDAarray[r].length; c++) {
				
				System.out.print(twoDAarray[r][c]+" ");
				
			}
			System.out.println();
		}

	}

}
