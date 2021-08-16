package com.syntax.reviewcalss04;

public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++) {
			System.out.println(i);
			for(int j=0;j<2;j++) {
				System.out.println(j);
				for(int k=0; k<2;k++) {
					System.out.println(k);
				}
			}
		}

	}

}
