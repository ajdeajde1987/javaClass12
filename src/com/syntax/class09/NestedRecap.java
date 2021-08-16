package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println("loop i");
			
			for(int j=1; j<4; j++) {
				System.out.println("loop j");
			}
		}
		System.out.println("----------------------multiplication table--------");
		
		for(int a=1; a<=10; a++) {
			for(int b=1; b<=10; b++) {
				System.out.println(a+" X "+b+" = "+ (a*b));
			}
			System.out.println("---------");
		}
		System.out.println("---------24 hour clock------");
		
		for(int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				if(h<10 && m<10) {
					System.out.println("0"+h+"0"+m);
				}else if(h>=10 && m<m) {
					System.out.println(h+":0"+m);
				}else if(h<10 && m<=10) {
					System.out.println("0"+h+"0"+m);
				}else {

					System.out.println(h+":"+m);
				}
				
				
				
			}
			
				
				}

			}
	
}

					
				

	


