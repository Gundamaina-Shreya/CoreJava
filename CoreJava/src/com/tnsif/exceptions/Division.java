package com.tnsif.exceptions;

import java.util.InputMismatchException;

public class Division {
	
	public static void divide(){
		int a=6,b=0,c;
		try {
			c=a/b;
			System.out.println("Division"+c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
		catch (Exception e)//super class for all the exceptions so without matching catch block we can use exep
		{
			System.out.println("exception caught"+e.getMessage());
		}
	}

}
