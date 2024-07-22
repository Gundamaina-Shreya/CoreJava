package com.tnsif.sampleprograms;
import java.util.Scanner;
public class Even_orOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("the number is even :"+a);
		}
		else
			
		{
			System.out.println("number is odd "+a);
		}
	}

}
