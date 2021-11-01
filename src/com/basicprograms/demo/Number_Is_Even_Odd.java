package com.basicprograms.demo;

import java.util.Scanner;

public class Number_Is_Even_Odd 
{

public static void main(String[] args)
	{
 Scanner sc= new Scanner(System.in);
 
 System.out.println("Enter the Number :  ");
 int Num=sc.nextInt();
 if(Num %2 == 0)
 {
	 System.out.println("The number is EVEN NUMBER ");
 }
 else
 {System.out.println("The number is ODD NUMBER");
	
 }
	}
}