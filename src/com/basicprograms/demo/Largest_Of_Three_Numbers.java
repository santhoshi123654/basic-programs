package com.basicprograms.demo;

import java.util.Scanner;

public class Largest_Of_Three_Numbers {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Number of Tosses : ");
 int Num1 =sc.nextInt();
 System.out.println("Enter the Number of Tosses : ");
 int Num2 =sc.nextInt();
 System.out.println("Enter the Number of Tosses : ");
 int Num3 =sc.nextInt();

	if(Num1>=Num2 && Num1>=Num3)
	{
		System.out.println("The Num1 is Greatest NUMBER");
		
	}
	else if(Num2>=Num3)
	{
	System.out.println("The Num2 is Greatest");
		
	}
	else
	{
		System.out.println("The Num3 is Greatest");
	}
	}
}
