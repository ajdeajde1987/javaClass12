package com.syntax.class10;

import java.util.Scanner;

public class TaskScannerArray {

	public static void main(String[] args) {
		
		Scanner scan;
		double[]array;
		double sum=0.0;
		
		scan=new Scanner(System.in);
		System.out.println("HOW many elemants are you storing");
		int size=scan.nextInt();
		array=new double[size];
		
		for(int i=0; i<size; i++) {
			
			array[i]=scan.nextDouble();
			sum=sum+array[i];
		}
		System.out.println("total"+sum);

}
}