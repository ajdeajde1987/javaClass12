import java.util.Scanner;

public class HmTaskClass06ifWay {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String calculator;
		
	     int num1,num2;
	     int result=0;
	     
		String operator;
	     System.out.println("Please enter two numbers");
	     num1=in.nextInt();
	     num2=in.nextInt();
	     System.out.println("please enter the operator(+,-,*,/");
	     
	    operator=in.next();
	    
	    if(operator.equals("+")) {
	    	result=num1+num2;
	    	
	    }else if(operator.equals("-")) {
	    	result=num1-num2;
	    	
	    }else if(operator.equals("*")) {
	    	result=num1*num2;
	    	
	    }else if(operator.equals("/")) {
	    	result=num1/num2;
	    	   }
	    System.out.println("The result is "+result);

	}

}
