package com.kh.ch05_object;

public class Student {
	// 필드부 : [접근제한자] [예약어] 자료형 필드명;
	private String name;
	private int age;
	private double height;
	private String phone;
	private String address;
	
	// 생성자부 : 접근제한자 클래스명([매개변수]) {}
	public Student() {}
	public Student(String name, int age, double height, String phone, String address) {
		this.name = name; this.address = address;
		this.age = age; this.phone =phone; this.height = height;
	}
	
	// 메소드부 : [접근제한자] [예약어] 반환타입 메소드명([매개변수]) {}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", phone=" + phone + ", address="
				+ address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	

}
