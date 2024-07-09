package com.tnsif.finalkeyword;

public class Finaldemo 
{
	final int x=10;
	static final int y;
	 final void change()//non static method
	{
		 System.out.println("default");			 
		 }
	 static {
			y=7;//if we did not initilize a var,we can initialize it in the static block


	}
}
