package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop extends Product {

	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price);
		this.allInOne = allInOne;
	}

	
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", allInOne : " + allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	

}
