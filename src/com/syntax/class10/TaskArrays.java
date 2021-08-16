package com.syntax.class10;

public class TaskArrays {

	public static void main(String[] args) {
		String[] countries= {"Serbia","Usa","France","Japan"};
		String capital="";
		
		for(String country:countries) {
			
			if(country.equals("Serbia")) {
				
				capital=" Belgrade";
				
			}else if(country.equals("Usa")) {
				capital=" DC";
				
					
				}else if(country.equals("France")) {
					capital=" Paris";
				}else if(country.equals("Japan")) {
					capital="Unknown";
				}
				
			System.out.println("Capital of "+country+" is "+capital);
		
		}
		
	
	}
				
			
			
			
			
			
		

	}


