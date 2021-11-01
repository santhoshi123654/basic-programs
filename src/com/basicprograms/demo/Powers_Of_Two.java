package com.basicprograms.demo;

import java.util.Scanner;

public class Powers_Of_Two {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of power values : ");
	
	int Num=sc.nextInt();
	int POWER=1;
			System.out.println(POWER);
			for(int i=1;i <=Num;i++)
			{
				POWER*=2;
				System.out.println(POWER);
			}
		
}
}