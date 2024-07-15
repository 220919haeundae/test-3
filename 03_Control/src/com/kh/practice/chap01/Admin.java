package com.kh.practice.chap01;

public class Admin extends Client {

	public Admin(String ID, String password, String grade) {
		super(ID, password);
		this.grade = "admin";
	}
	

}
