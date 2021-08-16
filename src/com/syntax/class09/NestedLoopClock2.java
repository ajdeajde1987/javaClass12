package com.syntax.class09;

public class NestedLoopClock2 {

	public static void main(String[] args) {
		for (int a = 0; a <= 2; a++) {
			for (int c = 0; c < 10; c++) {
				if (a == 2 && c == 4) {
					break;
				}
				for (int d = 0; d < 6; d++) {
					for (int b = 0; b < 10; b++) {
						System.out.println(a + "" + c + ":" + d + "" + b);
					}
				}
			}
		}
	}


	}


