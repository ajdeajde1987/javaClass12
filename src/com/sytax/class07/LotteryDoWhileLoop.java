package com.sytax.class07;

import java.util.Scanner;

public class LotteryDoWhileLoop {

	public static void main(String[] args) {
		//we have a secret number any from 1 till 20
		//ask user to guess your secret number
		//continue guessing  NUMBER UNTILLuser enter your secret number
		//once guessed lets say congrats
		
		Scanner in;
		int secretNumber, userName;
		secretNumber=15;
		
		in=new Scanner(System.in);
		
		do {
		System.out.println("Please guess my secret number");
		userName=in.nextInt();
		}while(userName!=secretNumber);
		
		System.out.println("congrats");
		
	}
}