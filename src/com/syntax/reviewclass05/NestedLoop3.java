package com.syntax.reviewclass05;

public class NestedLoop3 {

	public static void main(String[] args) {
		/*
		 * 123456789
		 * 12346789
		 * 123456789
		 * 123456789
		 */
		for (int j=0;j<4;j++) {
		for(int i=1; i<10;i++) {
			if(i==5 && j==1) {// j here shows what row are we at, and row starts from 0
				continue;
			}
			System.out.print(i);
			
		}
		System.out.println();

	}
	}
}
