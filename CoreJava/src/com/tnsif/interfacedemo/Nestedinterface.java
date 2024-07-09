package com.tnsif.interfacedemo;

public class Nestedinterface implements Myinterfaced.Myinnerinterface
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("inner interface");
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(Nestedinterface.id);
	}
	
}

