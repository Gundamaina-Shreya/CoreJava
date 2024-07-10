package com.tnsif.multithreading;
//multithreading demo
public class Extendingthread extends Thread{//thread is super most class
	public void run()
	{
		System.out.println("run state");
	}
	public static void main(String[] args) {
		Extendingthread e=new Extendingthread();//new state
		e.start();//runnable state
		
	}
	
}
