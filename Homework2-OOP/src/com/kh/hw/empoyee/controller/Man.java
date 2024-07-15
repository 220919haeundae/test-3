package com.kh.hw.empoyee.controller;

public class Man extends Person {

	char gender;
	
	public Man(String name, char gender) {
		
		super.name = name;
		this.gender = gender;
		
	}
	

	@Override
	public void info() {
		super.info();
		System.out.println(gender);
	}
	
	public void sdfsad() {
		super.info();
	}

	

	
}
