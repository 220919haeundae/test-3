package com.kh.practice.phonebook.model.vo;

import java.io.Serializable;

public class PhoneBook implements Serializable {
	private String name;
	private String phone_Number;
	private String belong;
	private String email;
	private String memo;
	
	public PhoneBook(String name, String phone_Number, String belong, String email, String memo) {
		this.name = name;
		this.phone_Number = phone_Number;
		this.belong = belong;
		this.email = email;
		this.memo = memo;
	}
	
	public String toString() {
		return String.format("이름 : %s, 전화번호 : %s, 소속 : %s, 이메일 주소 : %s, 메모 : %s"
				, name, phone_Number, belong, email, memo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
	

}
