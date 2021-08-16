package com.syntax.classReview03;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
	String userName="Maria";
	String password="pass1234";
	double availableFunds=100000;
	
if(userName.equals("Maria") && password.equals("pass123")){
	System.out.println("enter the amount of money that you wqnt to transfer");
	Scanner scanner=new Scanner(System.in);
	double amountToTransfer=scanner.nextDouble();
	if (amountToTransfer<availableFunds) {
		System.out.println("transfer successful");
	}else {
		System.out.println("insufficient balance");
	}
	
}else {
	System.out.println("invalis credentials");
}
	}

}
