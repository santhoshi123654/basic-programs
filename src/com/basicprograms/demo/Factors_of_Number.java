package com.basicprograms.demo;

import java.util.Scanner;

public class Factors_of_Number {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        
	System.out.println("Enter the Number : ");
	
	int Num = sc.nextInt();
	
	for(int i = 2; i < Num; i++)
	{
		while(Num%i == 0)
		{
			System.out.println(i);
			Num=Num/i;
		}
	}
	if(Num > 2)
		System.out.println(Num);
}
}
