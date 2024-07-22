package com.tnsif.arraylist;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("ra");	
	l.add(2);	
l.add("hige");	
l.add(8.9);	
System.out.println("After invoking add()"+l);
l.add(1,"apple");
l.addFirst("d");
l.addLast("rashmi");
System.out.println(l);
//LinkedList l1=new LinkedList();
//l1.add(l1);
//l1.add("ds");
//l1.add(l);
	}
}
