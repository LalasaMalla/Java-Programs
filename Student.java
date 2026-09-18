package com.lalasa;

public class Student {

			int id;
			String name;
		   Student (int id,String name)
		 {
			 this.id=id;
			 this.name=name;
			 }
		 void display()
		 {
			 System.out.println("Student ID : "+id);
			 System.out.println("Student Name : "+name);
		 }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Student s1=new Student(101,"ravi");
				Student s2=new Student(102,"ravi");
s1.display();
s2.display();
	}

}
