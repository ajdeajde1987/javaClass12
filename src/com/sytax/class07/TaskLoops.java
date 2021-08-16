package com.sytax.class07;

public class TaskLoops {

	public static void main(String[] args) {
	 //System.out.println("print numbers 1 to 100 in 1 line with space");
		
		int n=0;
		while(n <= 100) {
			n++;
			System.out.print(n+" ");
		}
	 //print number 100 to 1
int i=100;

while(i >=1) {
	i--;
	System.out.println(i);
	
}
//print only even numbers 20 to 100

int a=20;
while(a<=100) {
	if(a%2==0) {
		System.out.println(a);
	}
	a++;
	
	//odd numbers 100 to 1
	
	int odd=100;
	while(odd>=1) {
		if(odd%2!=0) {
			System.out.println(odd);
			
		}odd --;
	}
}
	}

}
