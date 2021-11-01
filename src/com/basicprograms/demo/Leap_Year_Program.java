package com.basicprograms.demo;

import java.util.Scanner;

public class Leap_Year_Program {
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the YEAR :");
 int YEAR=sc.nextInt();
 if(((YEAR % 4 == 0) && (YEAR % 100!= 0))|| (YEAR % 400 == 0))
 {
	 System.out.println("It is a Leap Year ");
 }
 else
 {
	 System.out.println("It is not a leap Year");
 }
	}
	
	

}
