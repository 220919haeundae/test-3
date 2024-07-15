package com.kh.example.practice1.run;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
	
	public Product(String name, int price, String brand) {
		this.pName = name;
		this.price = price;
		this.brand = brand;
	}
	
	public void information() {
		System.out.printf("제품 이름: %s\n제품 가격: %d\n브랜드: %s\n", pName, price, brand);
	}
	
}
