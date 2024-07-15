package com.kh.ch05_object;

public class Animal {
	// 정보 은닉
	private String name;
	private int age;
	private char gender;
	private String masterName;
	private String type;
	
	
	
	public Animal() {}
	public Animal(String name, int age, char gender, String masterName, String type) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.masterName = masterName;
		this.type = type;
	}
	
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + ", masterName=" + masterName + ", type="
				+ type + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public void setGender(char gender ) {
		this.gender = gender;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getMasterName() {
		return masterName;
	}
	public String getType() {
		return type;
	}
	
	
	//캡슐화
	

}
