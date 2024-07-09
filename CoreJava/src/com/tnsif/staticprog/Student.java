package com.tnsif.staticprog;

public class Student {
	int rollno;
	String name;
	static String college="sriindu";//static member
	static void change()//static method
	{
		college="indu";

	}
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+ college);
	}
}
