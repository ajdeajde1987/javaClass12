package com.syntax.class06;

import java.util.Scanner;

public class HomeworkClass06Task1 {

	public static void main(String[] args) {
		System.out.println("Please enter your country");
		Scanner in=new Scanner(System.in);
		String country;
		String language;
		country=in.nextLine();
		language=in.nextLine();
     switch (country) {
		case "USA":
			language="american";
			break;
	    case "Serbia":
			language="serbian";
			break;
		case "Italy":
			language="italian";
			break;
		case "Turkey":
			language="turkish";
			break;
		case "France":
			language="french";
			break;
		default:
			language="unknown";
				}
			System.out.println("In "+country+" people speak "+language);
		
		
		

	}

}
