package com.syntax.class09;

public class MoreArray {

	public static void main(String[] args) {
		
		double[]d=new double[4];
		d[1]=10.99;
		d[2]=12.99;
		d[3]=10;//casting
		//d[4]=1.99;//array index out of bound//error
		
		System.out.println((d[3]));
		
		int[] numbers=new int[2];
		numbers[0]=100;
		numbers[1]=200;
		System.out.println(numbers[1]);//array index out of bound	
		
		int arrayVar[];//declare an array
		int[]arr;//declare an array--- PREFERABLE
		
		arr=new int[3];
		arr[0]=10;
		System.out.println(arr[1]);

	}

}
