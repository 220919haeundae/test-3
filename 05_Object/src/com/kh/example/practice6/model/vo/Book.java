package com.kh.example.practice6.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {};
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discount) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discount;
	}
	
	
	public void information() {
		System.out.printf("제목: %s\n출판사: %s\n저자: %s\n가격: %d\n할인율: %f\n", title, publisher, author, price, discountRate);
	}
	
}
