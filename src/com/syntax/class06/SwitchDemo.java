package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
        int day=4;
		
		if (day==1) {
			System.out.println("today is monday");
		}else if  (day==2) {
			System.out.println("today is tuesday");
		}else if (day==3) {
			System.out.println("today is wednesday");
		}else if (day==4) {
			System.out.println("today is thursday");
			
					

			System.out.println("today is friday");
		}else if (day==6) {
			System.out.println("today is saturday");
		}else if (day==7) {
			System.out.println("today is sunday");
		}else {
			System.out.println(day+ " is invalid.please use day from 1-7");
		}

		System.out.println("-----USING SWITCH STATEMENT-----");
		String dayName;
		
		switch(day) {
		
		case 1:
			dayName="monday";
			break;
		case 2:
			dayName="tuesday";
			break;
		case 3:
			dayName="wednesday";
			break;
		case 4:
		    dayName="thursday";
		    break;
		case 5:
			dayName="friday";
			break;
		case 6:
			dayName="saturday";
		    break;
		case 7:
			dayName="sunday";
			break;
		default:
			dayName="invalid";
			
			
		}
		
		System.out.println("today is " + dayName);
		
	}

}
