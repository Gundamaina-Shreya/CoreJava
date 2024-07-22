package com.tnsif.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {
	public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("rohini");	
	a1.add("shreya");	
	a1.add("bhargavee");	
	//a1.add(6);
	System.out.println("elements"+a1);
	Iterator<String> itr=a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
