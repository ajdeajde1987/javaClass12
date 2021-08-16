package com.syntax.classReview03;

public class LogicalOperators {

	public static void main(String[] args) {
		
		//logical operators
		
		String day="Monday";
		if("Sunday".equals(day)) {
			System.out.println("its weekend");
		}else if (day.equals("Saturday")) {
			System.out.println("its a weekend");
		}else {
			System.out.println("its a week day");
		}
       if(day.equals("Sunday") | day.equals("Saturday")) {
    	   System.out.println("its weekend");
    	   
       }else {
    	   System.out.println("its weekday");
       }
	}

}
