package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		/*
		 * where are you from
		 * based on the countywe will define traditional food
		 */
       Scanner in;
       String country, traditionalFood;
      
       in=new Scanner(System.in);
       
       System.out.println("Where are you from?");
       country=in.nextLine();
       
       switch (country) {
       
       case "USA":
    	   traditionalFood="burger";
    	   break;
    	   
       case "Afganistan":
           traditionalFood="qabeli Palaw";
           break;
           
       case"Peru":
    	   traditionalFood="cevice";
    		   break;
    		   
       case"Italy":
    	   traditionalFood="pasta";
    	   break;
    	   
       case"Tajikistan":
    	   traditionalFood="kuruto";
    	   break;
    	   
       case"Ukraine":
    	   traditionalFood="borsch";
    	   break;
    	   
       case"Kazakhstan":
    	   traditionalFood="beshbarmak";
    	   break;
    	   
       case"Turkey":
    	   traditionalFood="burek";
    	   break;
    	   
    	default:
    		traditionalFood="unknown";
    		
           
        	   
	}
       
 System.out.println("you are from"+ country+ " and your traditional food is " +traditionalFood);
 
}
}
