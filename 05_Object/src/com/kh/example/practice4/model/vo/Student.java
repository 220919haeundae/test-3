package com.kh.example.practice4.model.vo;

public class Student {

	private static int grade = 3;
	private int classRoom;
	private String name;
	private double height;
	private char gender;
	
	
	public Student() {}
	public Student(int g1, int c, String name, double h, char g) {
		Student.grade = g1;
		this.classRoom = c;
		this.name = name;
		this.height = h;
		this.gender = g;
	}
	
	public void information() {
		System.out.printf("학년: %d \n반: %d \n이름: %s \n신장: %f \n성별: %c \n", grade, classRoom, name, height, gender);
	}
	
}
