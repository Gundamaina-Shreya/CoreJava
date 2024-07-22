package com.tnsif.collection;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String>v= new Vector<String>();
		System.out.println("Size of Vector"+v.size());
		v.add("red");
		v.add("blue");
		v.add("black");
		v.add("orange");
		int capacity=v.capacity();
		System.out.println(capacity);
		v.add(3, "pink");
		System.out.println(v);
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		v.add("orange");
		int capacity1=v.capacity();
		System.out.println(capacity1);
		
		}

}
