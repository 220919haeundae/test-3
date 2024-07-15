package com.kh.example.practice1.run;

public class Member {
	//변수 선언
	//[접근 제한자] [예약어] 자료형 변수명 [= 값];
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	String phone;
	String email;
	
	public Member() {}
	
	
	public Member(String id, String pwd, String name, int age, char gender, String number, String eamil) {
		memberId = id;
		memberPwd = pwd;
		memberName = name;
		age = age;
		gender = gender;
		phone = number;
		email = email;
	}
	
	public void changeName(String name) {
		memberName = name;
	}
	public void printName() {
		System.out.println(memberName);
	}
	
}
