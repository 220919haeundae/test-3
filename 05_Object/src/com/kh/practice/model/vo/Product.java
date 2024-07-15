package com.kh.practice.model.vo;

public class Product {
	
	private String name;
	private int price;
	private String brand;
	
	//생성자부
	//기본생성자
	public Product() {}
	
	//모든 필드를 매개변수로 갖는 생성자
	public Product(String n, int p, String b) {
		name = n;
		price = p;
		brand = b;
	}
	
	//메소드부
	//getter/setter : private으로 선언된 변수에 접근할 수 있도록 하는 메소드
	
	public String getName() {
		return name;
	}
	
	public int getrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public void setBrand(String b) {
		brand = b;
	}

}
