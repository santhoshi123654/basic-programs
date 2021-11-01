package com.basicprograms.demo;

import java.util.Scanner;

public class Quotient_and_Remainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dividend Number : ");
		int DIVIDEND_Number=sc.nextInt();
		System.out.println("Enter the Divisor Number : ");
		int DIVISOR_NUMBER=sc.nextInt();
		
		int quotient = DIVIDEND_Number/DIVISOR_NUMBER;
		int remainder= DIVIDEND_Number%DIVISOR_NUMBER;

		System.out.println("The Quotient is : " + quotient);
		System.out.println("The Remainder is : " + remainder);
	}
}
