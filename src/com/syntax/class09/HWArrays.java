package com.syntax.class09;

public class HWArrays {

	public static void main(String[] args) {
		
		String[] animals= {"cat","dog","turtle","horse","rabbit","squrl"};
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		//task 2
		
		double[]num={1.99 , 2.99, 3.99, 4.99};
		for(int a=num.length-1; a>=0; a--) {
			System.out.println(num[a]);
			
		}
		//task 3
		
		int[] numbers= {11, 12, 13, 14, 15};
		int sum=0;
		
		
		for(int i=0; i<numbers.length; i++)
		sum=sum + numbers[i];
		{
			System.out.println("SUm of all the elements in the arrey is "+sum);
			
			System.out.println("========sum using enhanced for loop======");
			sum=0;
			for(int n:numbers) {
				sum+=n;
			}
			System.out.println("total="+sum);
		}
		
		
	

	}

}
