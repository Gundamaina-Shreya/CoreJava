package com.tnsif.interfacedemo;

public class Demo implements Childinterface 
{

	@Override
	public void print() {
		System.out.println("print");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.print();
		d.show();
	}

}
