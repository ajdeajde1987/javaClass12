package com.syntax03;

public class WhatHappensCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i=1.99; error
		
		int i=(int)1.99;// narrowing explicit casting
		System.out.println(i);
		
		double d=1;
		System.out.println(d);
		
		//Casting in java:
		
		//widening/implicit/automatic
		
		//byte-short-int-long---float-double
		
		//narrowing/explicit/manual
		//double-float-long-int-short-byte
		
		byte b=(byte)128; //narrowing 
		
		System.out.println(b);
		
		int num=(int)9.99;
		
		int num1=20;
		int num2=3;
		
		System.out.println(num1/num2);//we divide 2 int values and they do not habe decimls
		
		double num3=20;
		double num4=3;//conversion from int to double happens
		
		System.out.println(num3/num4);//dividing two double values
		
		int t=100;
		//
		
		int n1=20;
		int n2=3;
		double dd=n1/n2;// we divide 2 int values and only the the results are storing in the double type
		
		System.out.println(dd);//6.0
		
		
		

long iii=500.4444;

long iii=(long)500.4444;

System.out.println(iii);
		
		
		
		
		

	}

}
