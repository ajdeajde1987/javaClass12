package com.syntax.class06;

public class recapLogicalOperators {

	public static void main(String[] args) {
		//our OR example
		System.out.println("-------AND EXAMPLE----");
		
		String position="Automation Tester";
		
		if(position.equals("Automation Tester") || position.equals("Manual Tester")){
				System.out.println("I am happy");
				
				
		//our AND EXAMPLE
				System.out.println("------OR EXAMPLE----");
				
				int salary=100000;
				if(position.equals("Automation Tester") && salary>=100000) {
					System.out.print("I will be extremely happy");
					
				}

			System.out.println("-------NOT EXAMPLE------")	;
			
			boolean study=false;
			
			if(!study) {
				System.out.println("you are not going to get a job");
				
			}
				
				
	}

}
}