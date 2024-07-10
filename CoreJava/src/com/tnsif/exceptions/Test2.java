package com.tnsif.exceptions;
//exep with no catch block
public class Test2 {
	public static void main(String[] args) {
		try
		{
			System.out.println(100/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finall block");
		}
	}
	

}
