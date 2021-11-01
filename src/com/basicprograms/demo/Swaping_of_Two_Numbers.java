package com.basicprograms.demo;

import java.util.Scanner;

public class Swaping_of_Two_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of num1 : " );
		int num1=sc.nextInt();
		System.out.println("Enter the Value of num2 : " );
		int num2=sc.nextInt();
		System.out.println("Before Swaping Number : " +num1);
		System.out.println("Before Swaping Number : " +num2);
		int temp=num1;
		num1=num2;
		num2=temp;
	
		System.out.println("After Swapping Number : " +num1);
		System.out.println("After Swaping Number : " +num2);	
	}
}
