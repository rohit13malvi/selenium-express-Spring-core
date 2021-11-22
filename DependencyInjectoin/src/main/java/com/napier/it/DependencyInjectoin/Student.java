package com.napier.it.DependencyInjectoin;

public class Student {
	private int id;

	private String studentName;

	public void setId(int id) {
		this.id = id;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
	public void displayName() {
		System.out.println("Student name is " + studentName + " and id is " + id);
	}

}
