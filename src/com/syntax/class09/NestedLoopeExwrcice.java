package com.syntax.class09;

public class NestedLoopeExwrcice {

	public static void main(String[] args) {
		System.out.println("---------WHAT IS THE OUTPUT--------");
		
		for (int i=0; i<=3; i++) {
			System.out.println("outer loop"+i);
			for(int j=0; j<3; j++) {
				System.out.println("inner loop"+j);
			}
			System.out.println("-----------");
			break;
		}
		System.out.println("---------WHAT IS THE OUTPUT--------");
		boolean boo=true;
		
		for(int i=1; i<3; i++){
			System.out.println("outer for loop");
			while(boo) {
				System.out.println("i am nested while loop");
				break;
			}
			
		}
	}

}
