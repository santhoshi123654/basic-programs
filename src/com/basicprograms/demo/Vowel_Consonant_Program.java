package com.basicprograms.demo;

import java.util.Scanner;

public class Vowel_Consonant_Program {

	public static void main(String[] args) {
		   
		int i=0;
		//boolean isVowel=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet : " );
		
		char ch=sc.next().charAt(0);
	   
		switch(ch) 
		{
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			i++;
			break;
			
		}
		if(i==1)
		{
			System.out.println("The Vowel is : " + ch);
	    }
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("The Consonant is : "+ch);
		}
		else
		{
		System.out.println("Please enter the Alphabet ");
		}
	}
}