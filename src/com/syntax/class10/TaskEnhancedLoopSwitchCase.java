package com.syntax.class10;

public class TaskEnhancedLoopSwitchCase {

	public static void main(String[] args) {
		String[] countries= {"Serbia","Usa","France","Japan"};
		String capital="";
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			case"Serbia":
				capital="Belgrade";
				break;
			case"Usa":
				capital="DC";
				break;
			case"France":
				capital="Paris";
				break;
			case"Japan":
				capital="unknown";
				
			}
			System.out.println("the capital of "+countries[i]+" is " +capital);
			
		}

	}

}
