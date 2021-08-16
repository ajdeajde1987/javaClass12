package com.syntax.class09;

public class RetrievingAll {

	public static void main(String[] args) {
		char[] grades= {'a','b','c','d','e','f','g'};
		int size=grades.length;
		System.out.println(size);
		
		System.out.println(grades[1]);
		
		int i=0;
		System.out.println(grades[i]);
		
		i++;
		System.out.println(grades[i]);
		
		System.out.println("=======retreiving all values using for loop======");
		
		for(int j=0; j<size; j++) {
			
			System.out.println(grades[j]);
		}
		
		System.out.println("--------------------------------");
		
		String[]names= {"Jose","Sule","Blake","Enes","Ana","Andrei","Burju","Gurkan"};
		
		for(int a=0; a<names.length; a++) {
			
			System.out.println(names[a]);
		}
		
		

	}

}
