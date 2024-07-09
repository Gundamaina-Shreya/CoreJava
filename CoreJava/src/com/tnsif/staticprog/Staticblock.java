// program for static block example
package com.tnsif.staticprog;

public class Staticblock {
	static //executed first than main at the time of class loading
	
	{
		System.out.println("static block");
		
		
	}
	public static void main(String[] args) {
		System.out.println("hello");
	}

}
