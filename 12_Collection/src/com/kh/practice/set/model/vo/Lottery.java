package com.kh.practice.set.model.vo;

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {}

	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String toString() {
		return name+"("+phone+")";
	}

	@Override
	public int hashCode() {
		return (name + phone).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery l = (Lottery)obj;
			return this.name.equals(l.name) && this.phone.equals(l.phone);
		} else return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
