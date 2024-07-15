package com.kh.hw.airconditional.airconditional;

public class AirConditional {
	private String mode;
	private int temp;
	private int windVolume;
	
	public AirConditional() {}
	
	public AirConditional(String mode, int temp, int windVolume) {
		this.mode = mode;
		this.temp = temp;
		this.windVolume = windVolume;
	}

	public String curentStatus() {
		return String.format("현재 모드 : %s 현재 온도 : %d 현재 풍량 : %d", mode, temp, windVolume);
	}
	
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getWindVolume() {
		return windVolume;
	}

	public void setWindVolume(int windVolume) {
		this.windVolume = windVolume;
	}
	
	
}
