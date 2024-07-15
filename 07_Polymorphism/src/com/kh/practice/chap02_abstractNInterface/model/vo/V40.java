package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
	
	
	//생성자부
	public V40() {
		setMaker("LG");
	}

	
	
	//메소드부
	
	
	@Override
	public String charge() {
		return "고속충전, 고속 무선충전";
	}



	@Override
	public String picture() {
		return "1200, 1600만 화소 트리플 카메라";
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public boolean bluetoothPen() {
		return !PEN_BUTTON;
	}

	@Override
	public String printInformation() {
		return "V40는 " + getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n"
	+ super.makeCall() + "\n"
	+ super.takeCall() + "\n"
	+ picture() + "\n"
	+ charge() + "\n"
	+ touch() + "\n"
	+ touch() + "블루투스 펜 탑재 여부 : " + bluetoothPen() + "\n";
	}
	
}
