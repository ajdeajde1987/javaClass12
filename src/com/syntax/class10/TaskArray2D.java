package com.syntax.class10;

public class TaskArray2D {

	public static void main(String[] args) {
		String[] []names= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jaskson","Obama"}
				

	};
		
		System.out.println(names[0][1]+" "+names[1][0]);
	    System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][2]+" "+names[1][1]);
		
		//how to access all elements
		System.out.println("=========");
		
		for(int r=0; r<names.length; r++) {//outer loop iterates over rows
			for(int c=0; c<names[r].length; c++) {// inner loop iterates over columns
		System.out.print(names[r][c]+" ");
			
			}
			
			System.out.println();
		
		

}
		System.out.println("=========");
		for(String[]arr:names) {
			for(String a:arr) {
				System.out.print(a+" ");
			}
		System.out.println();
		}
}
}