package com.tnsif.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		//ArrayList<String>a1=new ArrayList<String>();
		//a1.add("rterf");
		//user defined or custom cla
		ArrayList<String> a1=new ArrayList<String>();
		Student s=new Student(103,"shreya","CSE");
		a1.add(s);
		s.new Student(104,"reshmi","CSE");
		a1.add(s);
		s.new Student(105,"bhagya","CSE");
		a1.add(s);
		System.out.println("Before sorting "+a1);
		System.out.println(" After Sotring ");
		Collections.sort(a1);
		System.out.println(a1);
		}
}
