package com.syntax.class09;

public class TaskRetreavingAll {

	public static void main(String[] args) {
		// 
		
		String[] cars= {"Hyndai","Toyota","Kia","Mazda","Tesla","Honda"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("-----advance for loop/ehanced for loop/for each loop========");
		
		for(String car:cars) {
			System.out.println(car);
		}
		
		System.out.println("-------numbers array=======");
		
		int []numbers= {100,20,67,45,90,23};
		//regular for loop
		for(int a=0; a<numbers.length; a++) {
			System.out.println(numbers[a]);
			
		}
		//enhanced for loop
		for(int number:numbers) {
			System.out.println(number);
		}

	}

}
