package com.tnsif.throwsexample;
import java.util.Scanner;
public class Userdefined{
	private static int age;
	static void validate()throws Age
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age<18)
		
			throw new Age ("invalid age , you are not eligiable");
			else
				System.out.println("you can vote");
		
	}
	public static void main(String[] args) {
		try
		{
			Userdefined.validate();
		}
		catch(Age e)
		{
			System.out.println("caught exception "+e.getMessage());
		}
	}
}
