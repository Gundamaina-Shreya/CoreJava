package com.tnsif.staticprog;

public class Demo1 {
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(1,"shreya");
		Student s2=new Student(1,"jyo");
		Student s3=new Student(1,"bhargavi");
		s1.display();
		s2.display();
		s3.display();
		
	}

}
