package com.kh.practice;

public class Student {
	int no;		//학번
	String name;//이름
	int age;	//나이
	char gender;//성별
	
	public void inform() {
		System.out.println("[" + no + ", " + name + ", " + age + ", " + gender);
	}
	
	public void setName(String n) {
		this.name = n;
	}

}
