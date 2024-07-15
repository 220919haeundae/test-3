package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv extends Product {
	
	private int inch;
	
	public Tv() {}
	
	public Tv(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}
	
	
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", inch : " + inch;
	}

	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	

}
