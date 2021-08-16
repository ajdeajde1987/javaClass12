
public class Class04NestingIf {

	public static void main(String[] args) {
		
		
		boolean vaccine=true;
		
		boolean secondDose=true;
		
		
		if(vaccine) { //yes
			
			System.out.println("let check how many doses you got");
			
			if(secondDose) {
				 System.out.println("you are fully vaccinated");
			 }else {
				 System.out.println("you will need A SECOND DOSE");
			 }
			System.out.println("end of if block");
			
			
			
			
			
		}
		
		
		System.out.println("-----ANOTHER EXAMPLE OF NESTED IF-----");
		
		
		/*
		 * Every Friday is a movie day
		 * if it is the 13th---you want to watch a scary movie
		 * 
		
		 */
		
		int day=29;
		boolean isFriday=false;
	
		if(isFriday) {
			System.out.println("i am going to watch a movie");
			
			if(day==13) {
				System.out.println("yay, i am watching a scary movie");
			}else {
				System.out.println("i am watching whatever is popular");
			}
		}else {
			System.out.println("i am going to study");
		}
		
		
		
		
         System.out.println("end of code");
	}

	}

