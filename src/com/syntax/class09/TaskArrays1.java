package com.syntax.class09;

public class TaskArrays1 {

	public static void main(String[] args) {
		
		char[] arr=new char[6];
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		arr[5]='F';
		
		System.out.println(arr[1]);
		
		
		String[] eastCoastTeam=new String[8];
		eastCoastTeam[0]="Sule";
		eastCoastTeam[1]="Burju";
		eastCoastTeam[2]="Ana";
		eastCoastTeam[3]="Andrei";
		eastCoastTeam[4]="Blake";
		eastCoastTeam[5]="Enes";
		eastCoastTeam[6]="Gurkan";
		eastCoastTeam[7]="Jose";
		
		System.out.println(eastCoastTeam[0]);
		
		int size=eastCoastTeam.length;
		//Declaration and storing values must be complited right// shorter way
		
		String[]eastCoastTeam1= {"Jose","Sule","Blake","Enes","Ana","Andrei","Burju","Gurkan"};
		
		System.out.println(eastCoastTeam1[6]);
		eastCoastTeam1[6]="Francisko";
		System.out.println(eastCoastTeam1[6]);
		
		

	}

}
