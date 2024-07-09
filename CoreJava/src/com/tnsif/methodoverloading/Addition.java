package com.tnsif.methodoverloading;
//method overloading
public class Addition {
	static int add(int a,int b)
	{
		return a+b;
	}
	//order of parameter is different
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
