package com.tnsif.inheritance;

public class Student extends Citizen{
	private int rollno;
	private String collegename;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return super.toString()+"Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	public  Student(String name,long adharno,String address,long phono)
	{
		super(name,adharno,address,phono);
		
	}
	
	

}
