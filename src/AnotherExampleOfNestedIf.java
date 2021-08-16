
public class AnotherExampleOfNestedIf {

	public static void main(String[] args) {
		
		/*
		 * we have a test ---yes or no
		 * 
		 * if you done test then i want to check the score
		 * 
		 * 
		 * score is more then 90----A student
		 * score id more then 80----B student
		 * score is more then 70----C student
		 * otherswise you should study more for test
		 */

		
		boolean isCompleted=true;
		int score=85;
		
		if(isCompleted) {
			System.out.println("let check your grade");
			
			if(score>90) {
				System.out.println("A student");
			}else if (score>80) {
				System.out.println("B student");
			}else if(score>70) {
				System.out.println("C student");
			}else {
			System.out.println("please study for the test");
			}
		}else {
			System.out.println("you should have taken the test");
		}
	}

}
