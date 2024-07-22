package com.tnsif.sampleprograms;

public class Overriding2 extends MethodOverRdiding {
	void child ()
	{
		System.out.println("child class");
	}
     public static void main(String[] args) {
    	 {
    		 Overriding2 c=new Overriding2();
    		 c.child();
    	 }
	}
}


