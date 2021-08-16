package com.syntax.class05;
import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in)	;
		String month,season;
		
		
		System.out.println("please enter your birth month");	
		
	    month=scan.nextLine();
	    season=null;
	    
	    
	
	
	


if (month.equals("June") || month.equals("July") || month.equals("August")) {
	
	System.out.println("Summer");
	
	
}else if (month.equals("Sept") || month.equals("Oct") || month.equals("Nov")){
	System.out.println("Fall");
	
}else if (month.equals("Dec") || month.equals("Jan") || month.equals("Feb")) {
	System.out.println("Winter");
	
}else if (month.equals("March") || month.equals("April")) {
	System.out.println("Spring");
	
	System.out.println("You were born in season " + season);
	
}


	}

}
