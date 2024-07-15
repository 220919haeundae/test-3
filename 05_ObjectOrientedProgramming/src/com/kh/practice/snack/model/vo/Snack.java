package com.kh.practice.snack.model.vo;

public class Snack {
	String kind;
	String name;
	String flavor;
	int numOf;
	int price;
	
	public Snack() {};
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String information() {
		return String.format("%s(%s-%s) %d개 %d원", kind, name, flavor, numOf, price);
	}
	
	//[참고] String.format("%s(%s-%s) %d개 %d원", kind, name, flavor, numOf, price);
	
	

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	};

}
