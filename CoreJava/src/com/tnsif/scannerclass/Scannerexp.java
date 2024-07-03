package com.tnsif.scannerclass;
import java.util.Scanner;
public class Scannerexp {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you are name\n");
		String name=sc.nextLine();
		System.out.println("enter you are rollno\n");
		int rollno=sc.nextInt();
		System.out.println("name\nshreya"+name+"rollno\n"+rollno);
	}

}
